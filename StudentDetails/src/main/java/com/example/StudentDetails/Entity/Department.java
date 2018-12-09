package com.example.StudentDetails.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="department",schema="sd")
public class Department implements Serializable {
	
	private static final long serialVersionUID = -3210692972046154240L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String depatmentName;
	private String address;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepatmentName() {
		return depatmentName;
	}
	public void setDepatmentName(String depatmentName) {
		this.depatmentName = depatmentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
