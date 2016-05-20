package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUD {
	private String read = "SELECT * FROM person WHERE nummer = ?";
	private Connection con;

	public CRUD(Connection conn) {
		this.con = conn;
	}

	public void create() {
		
	}

	public void read(int nummer) {
		try {
			PreparedStatement ps = con.prepareStatement(read);
			ps.setInt(1, nummer);
			ResultSet tmp = ps.executeQuery();
			while (tmp.next()) {
				System.out.print("Nummer: " + tmp.getInt(1));
				System.out.print(", Vorname: " + tmp.getString(2));
				System.out.print(", Nachname: " + tmp.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update() {

	}

	public void delete() {

	}
}
