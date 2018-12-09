package com.example.StudentDetails.dtoo;

public class StudentData {
	private Integer id;
	private String sName;
	private String address;
	private DepartmentData departmentData;
	private LeaveData leaveData;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public DepartmentData getDepartmentData() {
		return departmentData;
	}
	public void setDepartmentData(DepartmentData departmentData) {
		this.departmentData = departmentData;
	}
	public LeaveData getLeaveData() {
		return leaveData;
	}
	public void setLeaveData(LeaveData leaveData) {
		this.leaveData = leaveData;
	}
	

}

