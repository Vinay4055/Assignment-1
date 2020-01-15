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

import java.util.ArrayList;
/**
 * This class is used to validate all the inputs.
 * @author vinayprajapati
 *
 */
public class Validation {
	static boolean isValid = true;
/**
 * This method checks for all the invalid inputs
 * @param list
 * @return
 * @throws NullPointerException
 * @throws NumberFormatException
 */
	public static boolean validation(ArrayList<String> list) throws NullPointerException, NumberFormatException {
		isValid = true;
		String type = null;
		String name = null;
		double price = 0.0;
		int quantity = 0;

		for (int i = 0; i < list.size() - 1; i += 2) {

			if (i % 8 == 0) {
				name = list.get(i + 1);
			}

			else if (list.get(i).equalsIgnoreCase("price")) {

				price = Double.parseDouble(list.get(i + 1));

			} else if (list.get(i).equalsIgnoreCase("quantity")) {
				quantity = Integer.parseInt(list.get(i + 1));

			} else if (list.get(i).equalsIgnoreCase("type")) {
				if (list.get(i + 1).equalsIgnoreCase("raw") || list.get(i + 1).equalsIgnoreCase("manufactured")
						|| list.get(i + 1).equalsIgnoreCase("imported"))
					type = list.get(i + 1);
			}

		}
		nameValidation(name);
		priceValidation(price);
		typeValidation(type);
		quantityValidation(quantity);
		return isValid;
	}

	public static void nameValidation(String name) throws NullPointerException {

		if (name.isEmpty()) {
			System.out.println("Name Can Not Be Blank");
			isValid = false;
		}
	}

	public static void priceValidation(double price) throws NullPointerException {

		if (price == 0.0) {
			System.out.println("Price Can Not Be Empty");
			isValid = false;
		}
		if (price < 0) {
			System.out.println("Invalid Range Of Price");
			isValid = false;
		}
	}

	public static void typeValidation(String type) throws NullPointerException {

		if (type == null) {
			System.out.println("Item Type is a mandatory field");
			isValid = false;
		}
	}

	public static void quantityValidation(int quantity) throws NullPointerException {

		if (quantity == 0) {
			System.out.println("Quantity can not be zero or empty");
			isValid = false;
		}
		if (quantity < 0) {
			System.out.println("Invalid Range Of Quantity");
			isValid = false;
		}
	}
}
