/**
 *   Copyright (C) 2012 axatrikx(Amal Bose)
 *
 *	 This file AxaIDriverManager.java is part of AxaDriver.
 *
 *   AxaDriver is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   AxaDriver is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with SeleniumGridAutomator.  If not, see <http://www.gnu.org/licenses/>.
 *  
 *   @author amalbose
 *   @created May 19, 2012
 */
package com.axatrikx.axamanager;

import com.axatrikx.system.Browser;

/**
 *
 */
public interface IDriverManager {

	/**
	 * Initializes the execution by setting up the driver based on the browser and other details. TODO Update javadoc comments.
	 */
	void initExecution();
	
	/**
	 * Initializes the execution by setting up the driver based on provided browser object.
	 * @param browser The {@link Browser} object of the browser to be initialized.
	 */
	void initExecution(Browser browser);
}
