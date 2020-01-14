/*
* Class name : TaxCalculatorImplementation
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
* Description : This class is the implementation of interface TaxCalculator and helps
* 				in managing the tax calculations for all the item type 
*/
package com.nagarro.training.assignment1.service;

import com.nagarro.training.assignment1.entity.Item;
import com.nagarro.training.assignment1.repository.TaxCalculator;
/**
 * This class is the implementation of interface TaxCalculator and helps<br>
 * in managing the tax calculations for all the item type
 * 
 * @author vinayprajapati
 *
 */
public class TaxCalculatorImplementation implements TaxCalculator {

	/**
	 * Calculates tax for the corresponding Item Object on the basis of
	 * item type(Raw,Manufactured,Imported) and return the tax.
	 * 
	 */
	@Override
	public double taxCalculation(Item item) throws ArrayIndexOutOfBoundsException,NullPointerException {
		// TODO Auto-generated method stub
		double price = item.getPrice();
		String type = item.getType();
		double tax = price*(12.5/100);
		double calculatedtax = 0; //Tax that will be returned by the function
		if(type.equalsIgnoreCase("Raw"))
		{
			calculatedtax = tax;
			
		}
		else if (type.equalsIgnoreCase("Manufactured"))
		{
			
			 double newamount = price+tax;
			 double tax_on_new_amount = newamount * (2.0/100);
			 calculatedtax = tax+tax_on_new_amount;
			// return calculatedtax;
			
		}
		else if (type.equalsIgnoreCase("Imported"))
		{
			//Ask From mentor whether to add manufactured tax or raw tax
			double surcharge = 0;
			double import_duty_tax = price*(0.1);
			double finalcost = price+tax+import_duty_tax;
			if (finalcost <= 100)
				surcharge = 5;
			else if (finalcost >100 && finalcost <= 200)
				surcharge = 10;
			else if (finalcost > 200)
				surcharge = (5.0/100)*finalcost;
			
			 calculatedtax = import_duty_tax + surcharge;
			}
		 return calculatedtax;
		
	}

}
