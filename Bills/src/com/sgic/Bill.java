package com.sgic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



public class Bill {
	
	private Integer billNo;
	private Date date;
	private String customerName;
	
	
	List<Item> items=new ArrayList<>();

	public Bill(Integer billNo, Date date) {
		
		this.billNo = billNo;
		this.date = date;
		
	}

	

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	
	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", date=" + date + ", customerName=" + customerName + ", items=" + items
				+ "]";
	}



	public void setItems(Item item) {
		items.add(item);
		
		
	}
	public float getTotal() {
	 	Iterator<Item> itemsIter=items.iterator();
	 	float total=0;
	 	while(itemsIter.hasNext()) {
	 		Item item=itemsIter.next();
	 		total=total+item.getItemPrice();
	 		
	 		
	 	}
	 	return total;
	}
	
	}
	
	

