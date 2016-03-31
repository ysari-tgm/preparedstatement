package src;

import java.sql.*;
import java.io.*;

/**
 * Es wird eine Verbindung mit der Datenbank erstellt.
 * 
 * @author Eren Sefer, Yunus Sari
 * @version 2016-03-30
 */
public class DBConnector {
	public static void main(String args[]) {
    String host = "";
    String db = "";
    String user = "";
    String pass = "";
    if (args.length > 0) {
      host = args[0];
      user = args[1];
      pass = args[2];
    } else {
      try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("IP-Adresse eingeben:");
        host = br.readLine();
        System.out.println("Namen des Datenbankes eingeben:");
        db = br.readLine();
        System.out.println("User:");
        user = br.readLine();
        System.out.println("Password:");
        pass = br.readLine();
      } catch (IOException e) {
        System.out.println("Die Eingabe konnte nicht durchgefuehrt werden. Fehler: " + e.getMessage());
      }
    }
    Connection c = null;
    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager.getConnection("jdbc:postgresql://" + host + "/" + db, user, pass);
      c.setAutoCommit(false);
      System.out.println("Verbindung erfolgreich!");
      c.close();
    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
    System.out.println("Erfolgreich beendet!");
  }

}