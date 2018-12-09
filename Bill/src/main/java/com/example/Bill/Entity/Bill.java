package com.example.Bill.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bill {

	@Id	
	private Integer billNo;
	private Date date;
	private String customerName;
	private float total;
	
	

}
