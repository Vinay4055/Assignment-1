/*
* Class name : ItemFactory
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
* Description : This class acts as a factory class which creates Object of Item class
 				 and add it to a ArrayList and returns that list of objects.
 				This class also manages Inputs of user and convert those inputs
 				in acceptable form.
 */
package com.nagarro.training.assignment1.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.nagarro.training.assignment1.entity.Item;

/**
 * 1.This class is a factory class which creates Object of Item class<br>
 * 2.Add it to a ArrayList and returns that list of objects<br>
 * 
 * @author vinayprajapati
 *
 */
public class ItemFactory {
	Item item;

	/**
	 * Creates the List Of Objects from given input.
	 * 
	 * @return List of Item objects
	 */
	public static List<Item> createItemObjectList(ArrayList<String> list, ArrayList<String> commandLineInput)
			throws ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException {

		ArrayList<Item> itemObjectList = null;

		commandLineInput.addAll(list);
		ItemFactory driver = new ItemFactory();
		itemObjectList = new ArrayList<Item>();

		for (int i = 0; i < commandLineInput.size() - 1; i += 2) {

			if (i % 8 == 0) {

				driver.item = new Item();
				driver.item.setName(commandLineInput.get(i + 1));
			}

			if (commandLineInput.get(i).equalsIgnoreCase("price")) {

				driver.item.setPrice(Double.parseDouble(commandLineInput.get(i + 1)));

			} else if (commandLineInput.get(i).equalsIgnoreCase("quantity")) {
				driver.item.setQuantity(Integer.parseInt(commandLineInput.get(i + 1)));

			} else if (commandLineInput.get(i).equalsIgnoreCase("type")) {

				driver.item.setType(commandLineInput.get(i + 1));

			}

			if (i % 6 == 0 && i != 0) {

				itemObjectList.add(driver.item);

			}
		}
		return itemObjectList.stream().distinct().collect(Collectors.toList());
	}

}
