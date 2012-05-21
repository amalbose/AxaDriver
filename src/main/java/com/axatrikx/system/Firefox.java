package com.axatrikx.system;

/**
 *
 */
public class Firefox extends Browser {

	/**
	 * Constructor. Sets the browser name.
	 * @param browserName The name of the browser.
	 */
	public Firefox(final String browserName) {
		super(browserName);
	}

	/**
	 * Constructor. Sets the browser name and location of browser executable.
	 * @param browserName The name of the browser.
	 * @param browserLocation The location of the browser executable.
	 */
	public Firefox(final String browserName, final String browserLocation) {
		super(browserName, browserLocation);
	}

}