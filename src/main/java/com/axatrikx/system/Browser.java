package com.axatrikx.system;

/**
 * The browser class for AxaDriver. Its responsible for setting the browser name, browser location and other
 * details regarding the browser.
 */
public class Browser {

	/**
	 * Name of the browser.
	 */
	private String	browserName;
	/**
	 * The location of browser in the system.
	 */
	private String	browserLocation;

	/**
	 * The constructor for Browser which sets the browserName. The browser executable location is expected to
	 * be the default location.
	 * 
	 * @param browserName
	 *            Name of the browser.
	 */
	public Browser(final String browserName) {
		super();
		this.browserName = browserName;
	}

	/**
	 * The constructor for Browser which sets the browserName and browser location.
	 * 
	 * @param browserName
	 *            Name of the browser.
	 * @param browserLocation
	 *            The location of browser in the system.
	 */
	public Browser(final String browserName, final String browserLocation) {
		this.browserName = browserName;
		this.browserLocation = browserLocation;
	}

	/**
	 * Gives the browser name.
	 * 
	 * @return Returns the name of the browser.
	 */
	public final String getBrowserName() {
		return browserName;
	}

	/**
	 * Sets the browser name.
	 * 
	 * @param browserName
	 *            the browserName to set
	 */
	public final void setBrowserName(final String browserName) {
		this.browserName = browserName;
	}

	/**
	 * Gives the browser location.
	 * 
	 * @return the browserLocation
	 */
	public final String getBrowserLocation() {
		return browserLocation;
	}

	/**
	 * Sets the location of browser.
	 * 
	 * @param browserLocation
	 *            The location of the browser executable in the system.
	 */
	public final void setBrowserLocation(final String browserLocation) {
		this.browserLocation = browserLocation;
	}

}
