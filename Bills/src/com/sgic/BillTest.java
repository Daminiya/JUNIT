package com.sgic;

import java.util.Date;

public class BillTest {

	public static void main(String[] args) {

		Bill bill = new Bill(1, new Date());

		bill.setCustomerName("dammi");

		Item item1 = new Item(1, "pencil", 2);
		Item item2 = new Item(2, "pen", 20);
		Item item3 = new Item(3, "BluePen", 10);

		bill.setItems(item1);
		bill.setItems(item2);
		bill.setItems(item3);
		
		
		

		System.out.println(bill.toString());
		System.out.println	("Total=" +bill.getTotal());
	}

}
