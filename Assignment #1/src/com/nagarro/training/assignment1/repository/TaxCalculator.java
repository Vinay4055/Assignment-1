/**
 * 
 */
package com.nagarro.training.assignment1.repository;

import com.nagarro.training.assignment1.entity.Item;

/*
* Interface name : TaxCalculator
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
* Description : This interface displays the prototype about functions that need to be implemented
 */
/**
 * This interface displays the prototype about functions that need to be
 * implemented
 * 
 * @author vinayprajapati
 * 
 * 
 *
 */
public interface TaxCalculator {
	/**
	 * This interface displays the prototype about functions that need to be
	 * implemented
	 * 
	 * @param <b>item</b>
	 * @return <b>Tax Of item</b>
	 */
	public double taxCalculation(Item item);
}
