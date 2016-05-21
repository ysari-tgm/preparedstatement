package src;

import java.sql.Connection;

/**
 * Hier wird das Programm zum Laufen gebracht. Der CLI Parser wird aufgerufen,
 * wodurch man sich mit dem DBConnecter zur Datenbank verbindet. Dannach werden
 * die CRUD Befehle mithilfe von Prepared Statements ausgefuehrt.
 * 
 * @author Eren Sefer, Yunus Sari
 * @version 2016-05-20
 */
public class Main {

	public static void main(String[] args) {
		CLIParser cli = new CLIParser(args);
		Connection con = cli.getConnection();
		CRUD crud = new CRUD(con);
		crud.read(1);
		crud.update("Yunus", "Sari", 2);
		crud.delete(2);
		crud.create(12000);
		cli.closeConnection();
	}
}