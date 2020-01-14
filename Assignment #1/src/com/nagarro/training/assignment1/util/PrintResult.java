/*
* Class name : PrintResult
*
* Version info : Java 8
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
	/*
	 * Prints  Item_Name,Item_Price,Tax,Item_FinalPrice
	 */
	public static void printResult(Item item , double calculatedTax) throws ArrayIndexOutOfBoundsException,NullPointerException
	{
		double finalPrice = item.getPrice()+calculatedTax;
		System.out.print(item.getName()+","+item.getPrice()+","+calculatedTax+","+finalPrice);
		System.out.println();
	}
}
