package com.example.StudentDetails.Service;

import java.util.List;
import java.util.Optional;

import com.example.StudentDetails.Entity.Department;



public interface DepartmentService {
	
	boolean addDepartment(Department department);
	boolean editDepartment(Department department,Integer id);
	boolean deleteDepartment(Integer id);
    Optional <Department>getDepartmentId(Integer id);
    List<Department> getAllDepartment();
	
}

