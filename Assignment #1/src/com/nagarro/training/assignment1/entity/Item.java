/*
* Class name : Item
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
* Description : This class represents an Item and all its data members
* 			    with getters and setters
 
 */
/**
 * @author vinayprajapati
 * 
 */
package com.nagarro.training.assignment1.entity;

/**
 * <p>
 * This class represents an Item and all its data members with getters and
 * setters
 * </p>
 * 
 * @author vinayprajapati
 *
 */
public class Item {
	protected double price;
	protected String type;
	String name;
	int quantity;

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param type
	 */
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
