package src;

import com.beust.jcommander.Parameter;

/**
 * In dieser Klasse werden die Einstellungen(Optionen zum Auswaehlen) vom
 * CLIParser gespeichert.
 * 
 * @author Yunus Sari, Eren Sefer
 * @version 2016-05-21
 *
 */
public class Settings {
	@Parameter(names = "-h", required = true)
	private String host;

	@Parameter(names = "-p", required = false)
	private int port;

	@Parameter(names = "-d", required = true)
	private String database;

	@Parameter(names = "-u", required = true)
	private String user;

	@Parameter(names = "-pw", required = true)
	private String password;

	/**
	 * @return Hostname (IP-Adresse)
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @return Portadresse des Hosts
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @return Name der Datenbank
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * @return Name des Benutzers
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @return Passwort des Benutzers
	 */
	public String getPassword() {
		return password;
	}
}
