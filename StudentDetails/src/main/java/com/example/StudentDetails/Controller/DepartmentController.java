package com.example.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDetails.Dto.Mapping.DepartmentDataToDepartment;
import com.example.StudentDetails.Entity.Department;
import com.example.StudentDetails.Service.DepartmentService;
import com.example.StudentDetails.dtoo.DepartmentData;
@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/department")
     public HttpStatus createDepartment(@RequestBody DepartmentData departmentData) {
		Department department=DepartmentDataToDepartment.mapToDepartment(departmentData);
		if (departmentService.addDepartment(department)) {
			return HttpStatus.OK;
			
		}
		return HttpStatus.BAD_REQUEST;
		
	}
	@GetMapping("/department")
	public ResponseEntity<List<Department>> getAllDepartment() {
		List<Department> department = departmentService.getAllDepartment();
		ResponseEntity<List<Department>> response = new ResponseEntity<>(department, HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/department/{id}")
	public HttpStatus editDepartment(@PathVariable(name="id")Integer id,@RequestBody DepartmentData departmentData )
	{
	Department department=DepartmentDataToDepartment.mapToDepartment(departmentData);
	if (departmentService.editDepartment(department,id)) {
		return HttpStatus.OK;
		
	}
	return HttpStatus.BAD_REQUEST;
	
	}


}







