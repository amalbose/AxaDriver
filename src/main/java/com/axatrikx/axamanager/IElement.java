package com.axatrikx.axamanager;

import java.util.HashMap;

import com.axatrikx.axaelement.AxaElement;

/**
 * IElement interface deals with all actions related to web elements as such attributes, css values etc.
 */
public interface IElement {

	/**
	 * Gets the specified attribute of the given {@link AxaElement} element.
	 * 
	 * @param element
	 *            The {@link AxaElement} element.
	 * @param attribute
	 *            The attribute of the element (e.g. "href", "type" etc).
	 * @return Returns the value for the attribute of the element specified.
	 */
	String getAttribute(AxaElement element, String attribute);

	/**
	 * Gets the specified CSS attribute of the given {@link AxaElement} element.
	 * 
	 * @param element
	 *            The {@link AxaElement} element.
	 * @param cssAttribute
	 *            The CSS attribute of the element (e.g. "display", "top" etc).
	 * @return Returns the value for the attribute of the element specified.
	 */
	String getCSSAttribute(AxaElement element, String cssAttribute);

	/**
	 * Gets all the attributes of the element in the form of a HashMap.
	 * 
	 * @param element
	 *            The {@link AxaElement} element.
	 * @return A HashMap containing all the attributes and values of the element.
	 */
	HashMap<String, String> getAllAttributes(AxaElement element);

	/**
	 * Checks if the element is visible on the page.
	 * 
	 * @param element
	 *            The {@link AxaElement} element.
	 * @return True if element is visible on the page and False otherwise.
	 */
	boolean isDisplayed(AxaElement element);

	/**
	 * Checks if the element is of Zero size.
	 * 
	 * @param element
	 *            The {@link AxaElement} element.
	 * @return True if element is of Zero size and False otherwise.
	 */
	boolean isZeroSized(AxaElement element);

}
