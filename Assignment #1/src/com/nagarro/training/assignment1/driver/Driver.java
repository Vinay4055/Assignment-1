package com.nagarro.training.assignment1.driver;
/*
* Class name : Driver
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
* Description : This class is main class that Takes User Input and manages all the exceptions 
 
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.nagarro.training.assignment1.entity.Item;
import com.nagarro.training.assignment1.repository.TaxCalculator;
import com.nagarro.training.assignment1.service.TaxCalculatorImplementation;
import com.nagarro.training.assignment1.util.ItemFactory;
import com.nagarro.training.assignment1.util.RetrievingObjectFromList;
/**
 * This class is main class that Takes User Input and manages all the exceptions
 * @author vinayprajapati
 *
 */
public class Driver {
	
	
/**
 * 
 * @param args
 */
	public static void main(String args[])
	{
		/*
		 * Taking Input From User and storing those input to a 
		 * ArrayList named input,the command line arguments are present in args
		 */
		StringTokenizer tokenizer=null;
		String input;
		System.out.println("Do you want to enter details of any other item (y/n):");
		Scanner sc = new Scanner(System.in);
	    input = sc.nextLine();
	    ArrayList<String> list = new ArrayList<String>();
		if (input.equalsIgnoreCase("y")) {
		do {
		   System.out.println("Enter Next Item Details");
		   String str = sc.nextLine();
		   tokenizer = new StringTokenizer(str,"-");//making tokens of input using delimeter '-'
		   if (tokenizer.countTokens()==4)
		   {
		   while (tokenizer.hasMoreTokens())
		   {
			   String temp[]=tokenizer.nextToken().split(" ");//seperating name and item_name using delimeter
			   list.add(temp[0]);
			   list.add(temp[1]);
		   }
		   System.out.println("Do you want to enter details of any other item (y/n):");
		   input=sc.nextLine();
		   }
		   else { 
			   System.out.println("Insufficient Information");
		   	   System.out.println("The Input Should Be in the form\n"
					+ "-name item_name "
					+ "-price item_price "
					+ "-quantity item_quantity "
					+ "-type item_type\n"
					+ "You can give input in any order but item name should be provided at very first place");
		   	}
		}
		while (input.equalsIgnoreCase("y"));
		}
		else if (! (input.equalsIgnoreCase("n")))
			System.out.println("Select from y/n");
		try {
		List<Item> itemObjectList = ItemFactory.createItemObjectList(list,args);
		RetrievingObjectFromList.retrieveItemObject(itemObjectList);
		}
		catch (NullPointerException | 
				ArrayIndexOutOfBoundsException |
				NumberFormatException exception)
		{
			
			if (exception instanceof NumberFormatException)
				System.out.println("Please Check Some Of Your Item details \" Price or Quantity should be in Integer Format\"");
			
			else if (exception instanceof ArrayIndexOutOfBoundsException)
			{
			System.out.println("Invalid Input\n"
					+ "The Input Should Be in the form\n"
					+ "-name item_name "
					+ "-price item_price "
					+ "-quantity item_quantity "
					+ "-type item_type\n"
					+ "You can give input in any order but item name should be provided at very first place");
			
			}
		}
		finally
		{
			sc.close();
		}
	}
	

}
