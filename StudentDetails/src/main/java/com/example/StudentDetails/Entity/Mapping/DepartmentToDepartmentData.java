package com.example.StudentDetails.Entity.Mapping;

import com.example.StudentDetails.Entity.Department;
import com.example.StudentDetails.dtoo.DepartmentData;

public class DepartmentToDepartmentData {
	public static DepartmentData mapToDepartment(Department department) {
		DepartmentData departmentData=new DepartmentData();
		if (department !=null) {
			department.setId(departmentData.getId());
			department.setAddress(departmentData.getAddress());
			department.setDepatmentName(departmentData.getDepatmentName());
		}
		return departmentData;
			
		}

}
