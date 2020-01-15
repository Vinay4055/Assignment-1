package com.nagarro.training.assignment1.driver;
/*
* Class name : Driver
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
* Description : This class is main class that Takes User Input and manages all the exceptions 
 
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.nagarro.training.assignment1.entity.Item;
import com.nagarro.training.assignment1.util.ItemFactory;
import com.nagarro.training.assignment1.util.ManagingInput;
import com.nagarro.training.assignment1.util.RetrievingObjectFromList;
import com.nagarro.training.assignment1.util.Validation;

/**
 * This class is main class that Takes User Input and manages all the exceptions
 * 
 * @author vinayprajapati
 *
 */
public class Driver {

	/**
	 * Taking Input From User and storing those input to a ArrayList named input,the
	 * command line arguments are present in args
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc = null;

		String input;
		ArrayList<String> commandLineInput = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 0)
				commandLineInput.add(args[i].substring(1));
			else
				commandLineInput.add(args[i]);
		}
		boolean isValid = Validation.validation(commandLineInput);
		if (!isValid) {
			commandLineInput.clear();
			System.out.println("Invalid Command Line Arguments");
		}
		System.out.println("Do you want to enter details of any other item (y/n):");
		sc = new Scanner(System.in);
		input = sc.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		try {

			if (input.equalsIgnoreCase("y")) {

				do {
					list = ManagingInput.managingInput();
					System.out.println("Do you want to enter details of any other item (y/n):");
					input = sc.nextLine();

				}

				while (input.equalsIgnoreCase("y"));
			} else if (!(input.equalsIgnoreCase("n"))) {
				System.out.println("Invalid Input");
				System.out.println("Select from y/n");
				System.out.println("Invalid Input Exit");
			}

			List<Item> itemObjectList = ItemFactory.createItemObjectList(list, commandLineInput);
			RetrievingObjectFromList.retrieveItemObject(itemObjectList);

		} catch (NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException
				| IOException exception) {
			if (exception instanceof NullPointerException)
				System.out.println("Invalid Arguments");
			if (exception instanceof NullPointerException)
				System.out.println("Invalid Arguments");
			if (exception instanceof NumberFormatException)
				System.out.println(
						"Please Check Some Of Your Item details \" Price or Quantity should be in Integer Format\"");

			else if (exception instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Invalid Input\n" + "The Input Should Be in the form\n" + "-name item_name "
						+ "-price item_price " + "-quantity item_quantity " + "-type item_type\n"
						+ "You can give input in any order but item name should be provided at very first place");

			}
		}

	}

}
