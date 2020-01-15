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

import com.nagarro.training.assignment1.entity.Item;

public class PrintResult {
	static int i = 1;

	/**
	 * Prints Item_Name,Item_Price,Tax,Item_FinalPrice
	 * 
	 * @param
	 */
	public static void printResult(Item item, double calculatedTax)
			throws ArrayIndexOutOfBoundsException, NullPointerException {
		if (i == 1) {
			i++;
			System.out.println("Item Name\t\tPrice\t\tTax\t\tFinal Price\t\t");
		}
		double finalPrice = item.getPrice() + calculatedTax;

		System.out.print(item.getName());
		System.out.print("\t\t\t" + item.getPrice() + "\t\t" + calculatedTax + "\t\t" + finalPrice);
		System.out.println();
	}

}
