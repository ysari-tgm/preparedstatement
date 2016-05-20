package src;

import com.beust.jcommander.Parameter;

public class Settings {
	@Parameter(names = "-h", description = "Host", required = true)
	private String host;

	@Parameter(names = "-p", description = "Port", required = false)
	private String port;

	@Parameter(names = "-d", description = "Database", required = true)
	private String database;

	@Parameter(names = "-u", description = "User", required = true)
	private String user;

	@Parameter(names = "-pw", description = "Password", required = true)
	private String password;

	/**
	 * @return host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @return port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @return database
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
}
