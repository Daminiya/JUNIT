package com.sgic;

public class Item {
	private Integer itemNumber;
	private String itemName;
	private float itemPrice;
	public Item(Integer itemNumber, String itemName, float itemPrice) {
		
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		
	}
	public float getItemPrice() {
		return itemPrice;
	}
	

}
