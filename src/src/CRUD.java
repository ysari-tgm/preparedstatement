package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {
	private String update = "UPDATE person SET vorname = ?, nachname = ? WHERE nummer = ?";
	private String read = "SELECT * FROM person WHERE nummer = ?";
	private Connection con;

	public CRUD(Connection conn) {
		this.con = conn;
		try {
			con.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void create() {
		
	}

	public void read(int nummer) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(read);
			ps.setInt(1, nummer);
			ResultSet tmp = ps.executeQuery();
			while (tmp.next()) {
				System.out.print("Nummer: " + tmp.getInt(1));
				System.out.print(", Vorname: " + tmp.getString(2));
				System.out.print(", Nachname: " + tmp.getString(3) + "\n");
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(String vorname, String nachname, int nummer) {
		try {
			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(1, vorname);
			ps.setString(2, nachname);
			ps.setInt(3, nummer);
			ps.executeUpdate();
			read(2);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete() {

	}
}
