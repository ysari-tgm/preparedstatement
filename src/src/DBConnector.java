package src;

import java.sql.*;

/**
 * Es wird eine Verbindung mit der Datenbank erstellt.
 * 
 * @author Eren Sefer, Yunus Sari
 * @version 2016-03-31
 */
public class DBConnector {
	private Connection c;
	
	/**
	 * Es wird eine Verbindung mit der Datenbank erstellt
	 * 
	 * @param	host	Hostname (IP-Adresse)
	 * @param	db		Name der Datenbank
	 * @param	user	Name des Benutzers
	 * @param	pass	Passwort des Benutzers
	 */
	public DBConnector(String host, String db, String user, String pass){
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			c = DriverManager.getConnection("jdbc:postgresql://" + host + "/" + db, user, pass);
		    c.setAutoCommit(false);
		    System.out.println("Verbindung erfolgreich!");
		    c.close();
		    System.out.println("Erfolgreich beendet!");
	    } catch (Exception e) {
			e.printStackTrace();
	    	//System.err.println("Verbindung gescheitert");
		}
	}
}