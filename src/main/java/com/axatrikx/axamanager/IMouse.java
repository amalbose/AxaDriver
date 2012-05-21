package com.axatrikx.axamanager;

import com.axatrikx.axaelement.AxaElement;

/**
 * IMouse interface is responsible for actions dealing with mouse movements.
 */
public interface IMouse {

	/**
	 * Clicks on the specified element.
	 * 
	 * @param element
	 *            The {@link AxaElement} element to click on to.
	 */
	void clickOnElement(AxaElement element);

	/**
	 * Double clicks on the specified element.
	 * 
	 * @param element
	 *            The {@link AxaElement} element to double click
	 */
	void doubleClickOnElement(AxaElement element);

	/**
	 * Clicks the middle button on the element.
	 * 
	 * @param element
	 *            The {@link AxaElement} element to middle click.
	 */
	void middleClickOnElement(AxaElement element);

	/**
	 * Hover on the specified element.
	 * 
	 * @param element
	 *            The {@link AxaElement} element to hover over.
	 */
	void hoverOverElement(AxaElement element);

	/**
	 * Move mouse pointer from one element to another.
	 * 
	 * @param fromElement
	 *            The source element to hover from.
	 * @param toElement
	 *            The target element to hover to.
	 */
	void mouseMove(AxaElement fromElement, AxaElement toElement);

	/**
	 * Clicks and holds the mouse from source element and moves to target element and releases the mouse.
	 * 
	 * @param sourceElement
	 *            The source element where the mouse is clicked and dragged from.
	 * @param targetElement
	 *            The target element where where the mouse is released.
	 */
	void dragAndDrop(AxaElement sourceElement, AxaElement targetElement);

	/**
	 * Scrolls the mouse down by the specified times.
	 * 
	 * @param count
	 *            The times mouse should be scrolled down.
	 */
	void scrollDown(int count);

	/**
	 * Scrolls the mouse up by the specified times.
	 * 
	 * @param count
	 *            The times mouse should be scrolled up.
	 */
	void scrollUp(int count);
}