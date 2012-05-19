package com.axatrikx.axamanager;

import com.axatrikx.axaelement.AxaElement;

/**
 * IForm interface facilitates the handling of various form elements in the web page.
 */
public interface IForm {

	/**
	 * Sets the given text in the element specified.
	 * 
	 * @param textField
	 *            The {@link AxaElement} element identifying the text field to type to.
	 * @param textToEnter
	 *            The text string to enter into the element.
	 */
	void setText(AxaElement textField, String textToEnter);

	/**
	 * Clears the given AxaElement element.
	 * 
	 * @param textField
	 *            The {@link AxaElement} element identifying the text field to clear.
	 */
	void clearField(AxaElement textField);

	/**
	 * Submits the form.
	 * 
	 * @param formElement
	 *            The {@link AxaElement} element identifying any field in the form.
	 */
	void submitForm(AxaElement formElement);

	/**
	 * Clears all data from the form.
	 * 
	 * @param formElement
	 *            The {@link AxaElement} element identifying the form. [The element specifying <i>"form"</i>
	 *            tag]
	 */
	void clearForm(AxaElement formElement);

	/**
	 * Select the radio button element.
	 * 
	 * @param radioButtonElement
	 *            The {@link AxaElement} element identifying the radio button to select.
	 */
	void selectRadioButton(AxaElement radioButtonElement);

	/**
	 * Select the radio button of the given index(n).
	 * 
	 * @param radioButtonGroup
	 *            The {@link AxaElement} element identifying the radio group. [The element specifying
	 *            <i>"select"</i> tag]
	 * @param indexToClick
	 *            The index of the radio button to click.
	 */
	void selectNthRadioButton(AxaElement radioButtonGroup, int indexToClick);

	/**
	 * Selects the check box item.
	 * 
	 * @param checkBoxItem
	 *            The {@link AxaElement} element identifying the check box item to select.
	 */
	void selectCheckBoxElement(AxaElement checkBoxItem);

	/**
	 * Selects the check box item of the given index.
	 * 
	 * @param checkBoxElement
	 *            The {@link AxaElement} element identifying the checkbox group. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param indexToCheck
	 *            The index of the check box item to click.
	 */
	void selectCheckBoxElementByIndex(AxaElement checkBoxElement, int indexToCheck);

	/**
	 * Selects multiple check box items by the given array of indexes.
	 * 
	 * @param checkBoxElement
	 *            The {@link AxaElement} element identifying the checkbox group. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param indexesToCheck
	 *            The array of indexes specifying the elements to click. <br/>
	 *            For selecting indexes 1, 2 and 4, pass an int array with entries 1,2 and 4.<br/>
	 *            {@code  indexesToSelect = [1, 2, 4] }
	 */
	void selectCheckBoxElementsByIndex(AxaElement checkBoxElement, int[] indexesToCheck);

	/**
	 * Selects multiple check box items by the given array of values.
	 * 
	 * @param checkBoxElement
	 *            The {@link AxaElement} element identifying the checkbox group. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param valuesToCheck
	 *            The array of values specifying the elements to click. <br/>
	 *            For selecting items with values "val1", "val2" and "val4", pass an string array with entries
	 *            "val1", "val2" and "val4".<br/>
	 *            {@code  valuesToCheck = ["val1", "val2", "val4"] }
	 */
	void selectCheckBoxElementsByValue(AxaElement checkBoxElement, String[] valuesToCheck);

	/**
	 * Selects list box item by the given value.
	 * 
	 * @param listBoxElement
	 *            The {@link AxaElement} element identifying the listbox. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param itemValue
	 *            The value of the list box item to select.
	 */
	void selectListBoxItemByValue(AxaElement listBoxElement, String itemValue);

	/**
	 * Selects list box item by the given index.
	 * 
	 * @param listBoxElement
	 *            The {@link AxaElement} element identifying the listbox. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param indexToSelect
	 *            The index of the list box item to select.
	 */
	void selectListBoxItemByIndex(AxaElement listBoxElement, int indexToSelect);

	/**
	 * Selects list box item by the visible text of the item.
	 * 
	 * @param listBoxElement
	 *            The {@link AxaElement} element identifying the listbox. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param visibleText
	 *            The visible text of the item to select.
	 */
	void selectListBoxItemByVisibleText(AxaElement listBoxElement, String visibleText);

	/**
	 * Selects multiple list box items by the given values.
	 * 
	 * @param listBoxElement
	 *            The {@link AxaElement} element identifying the listbox. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param itemValues
	 *            The array of values specifying the elements to click. <br/>
	 *            For selecting items with values "val1", "val2" and "val4", pass an string array with entries
	 *            "val1", "val2" and "val4".<br/>
	 *            {@code  valuesToCheck = ["val1", "val2", "val4"] }
	 */
	void selectListBoxItemsByValue(AxaElement listBoxElement, String[] itemValues);

	/**
	 * Selects multiple list box items by the given indexes.
	 * 
	 * @param listBoxElement
	 *            The {@link AxaElement} element identifying the listbox. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param indexesToSelect
	 *            The array of indexes specifying the elements to click. <br/>
	 *            For selecting indexes 1, 2 and 4, pass an int array with entries 1,2 and 4.<br/>
	 *            {@code  indexesToSelect = [1, 2, 4] }
	 */
	void selectListBoxItemsByIndex(AxaElement listBoxElement, int[] indexesToSelect);

	/**
	 * Selects multiple list box items by the given visible texts.
	 * 
	 * @param listBoxElement
	 *            The {@link AxaElement} element identifying the listbox. [The element specifying
	 *            <i>"select"</i> tag].
	 * @param visibleTexts
	 *            The array of visible texts specifying the elements to click. <br/>
	 *            For selecting items with visible texts "text1", "text2" and "text4", pass an string array
	 *            with entries "text1", "text2" and "text4".<br/>
	 *            {@code  valuesToCheck = ["text1", "text2", "text4"] }
	 */
	void selectListBoxItemsByVisibleText(AxaElement listBoxElement, String[] visibleTexts);

	/**
	 * Gets the maximum allowed width of the text field.
	 * 
	 * @param textField
	 *            The {@link AxaElement} element identifying the text field in the form.
	 * @return The maximum number of characters allowed in the textfield.
	 */
	int getTextFieldMaxWidth(AxaElement textField);

}
