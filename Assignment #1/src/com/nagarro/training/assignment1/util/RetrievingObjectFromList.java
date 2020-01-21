/*
* Class name : RetrievingObjectFromList
*
* Version info : 1.0
*
* Copyright notice
* 
* Author info :Vinay Kumar Prajapati(vinay.prajapati@nagarro.com)
*
* Creation date : 13/01/2020
*
* Last updated By
*
* Last updated Date
*
* Description : This class retrieves the Item objects from ItemObjectList and 
* 				returns the tax for every Item.
 */
package com.nagarro.training.assignment1.util;

import java.util.Iterator;
import java.util.List;

import com.nagarro.training.assignment1.entity.Item;
import com.nagarro.training.assignment1.repository.TaxCalculator;
import com.nagarro.training.assignment1.service.TaxCalculatorImpl;

/**
 * This class retrieves the Item objects from ItemObjectList
 * 
 * @author vinayprajapati
 *
 */
public class RetrievingObjectFromList {
	/**
	 * This methods retrieves objects from array list of Item Objects and calls
	 * printResult method of PrintResult class.
	 * 
	 * @param List<Item> itemObjects
	 * @throws ArrayIndexOutOfBoundsException
	 * @throws NullPointerException
	 */
	public static void retrieveItemObject(List<Item> itemObjects)
			throws ArrayIndexOutOfBoundsException, NullPointerException {

		Iterator<Item> iterator = itemObjects.iterator();
		TaxCalculator taxCalculator = new TaxCalculatorImpl();
		while (iterator.hasNext()) {
			Item item = (Item) iterator.next();
			double calculatedTax = taxCalculator.taxCalculation(item);
			PrintResult.printResult(item, calculatedTax);
		}

	}
}
