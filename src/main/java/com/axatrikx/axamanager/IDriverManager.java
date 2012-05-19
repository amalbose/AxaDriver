package com.axatrikx.axamanager;

import com.axatrikx.system.Browser;

/**
 * An interface that manages the activities for setting up the {@link AxaDriver} .
 */
public interface IDriverManager {

	/**
	 * Initializes the execution by setting up the driver based on the browser and other details. TODO Update
	 * javadoc comments.
	 */
	void initExecution();

	/**
	 * Initializes the execution by setting up the driver based on provided browser object.
	 * 
	 * @param browser
	 *            The {@link Browser} object of the browser to be initialized.
	 */
	void initExecution(Browser browser);
}
