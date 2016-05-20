package src;

import com.beust.jcommander.Parameter;

public class Settings {
	@Parameter(names = "-h", description = "Host", required = true)
	private String host;
	
	/**
	 * @return	host
	 */
	public String getHostname() {
		return host;
	}
}
