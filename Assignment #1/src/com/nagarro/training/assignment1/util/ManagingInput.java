
/*
* Class name : PrintResult
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
* Description : This class Prints the output for every Item.
 */
package com.nagarro.training.assignment1.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This class Takes the input from the user.
 * 
 * @author vinayprajapati
 *
 */
public class ManagingInput {

	static ArrayList<String> listItemAdded = new ArrayList<String>();

	/**
	 * Takes input from the user
	 * 
	 * @return
	 * @throws IOException
	 * @throws NullPointerException
	 * @throws ArrayIndexOutOfBoundsException
	 * @throws NumberFormatException
	 */
	public static ArrayList<String> managingInput()
			throws IOException, NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException {

		ArrayList<String> list = new ArrayList<String>();
		StringTokenizer tokenizer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Next Item Details");
		String str = sc.nextLine();
		tokenizer = new StringTokenizer(str, "-");// making tokens of input using delimeter '-'
		if (tokenizer.countTokens() == 4) {
			while (tokenizer.hasMoreTokens()) {
				String temp[] = tokenizer.nextToken().split(" ");// seperating name and item_name using delimeter
				if (temp.length == 2) {
					list.add(temp[0]);
					list.add(temp[1]);
				}

			}

			boolean isValid = Validation.validation(list);
			if (isValid) {

				listItemAdded.addAll(list);
			}
		} else {
			System.out.println("Invalid Information,Please Check Your Input");
			System.out.println("The Input Should Be in the form\n" + "-name item_name " + "-price item_price "
					+ "-quantity item_quantity " + "-type item_type\n"
					+ "You can give input in any order but item name should be provided at very first place");
		}

		return listItemAdded;

	}
}
