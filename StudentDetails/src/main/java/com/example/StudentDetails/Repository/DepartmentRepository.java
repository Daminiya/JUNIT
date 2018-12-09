package com.example.StudentDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentDetails.Entity.Department;

public interface DepartmentRepository  extends JpaRepository<Department,Integer>{

	
}
