package com.example.StudentDetails.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDetails.Entity.Department;
import com.example.StudentDetails.Repository.DepartmentRepository;
import com.example.StudentDetails.Service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public boolean addDepartment(Department department) {
		departmentRepository.save(department);
		return true;
	}

	@Override
	public boolean editDepartment(Department department, Integer id) {
		boolean success=false;
		if(departmentRepository.getOne(id)!=null){
			department.setId(id);
			departmentRepository.save(department);
			success=true;
		}
		return success;
	}

	
	@Override
	public boolean deleteDepartment(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
	@Override
	public List<Department> getAllDepartment() {
		
			return departmentRepository.findAll();
		}

	

	@Override
	public Optional<Department> getDepartmentId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
//	@Override
//	public boolean editWelfareEvent(WelfareEvent welfareEvent) {
//		boolean success = false;
//		if (welfareEventRepository.getOne(welfareEvent.getId()) != null) {
//			welfareEventRepository.save(welfareEvent);
//			success = true;
//		}
//		return success;
//	}
//
//	@Override
//	public boolean deleteWelfareEvent(Integer id) {
//		WelfareEvent welfareEvent = welfareEventRepository.getOne(id);
//		if (welfareEvent.getId() == (id)) {
//			welfareEventRepository.deleteById(id);
//			return true;
//		}
//		return false;
//	}
//
//	@Override
//	public WelfareEvent getById(Integer id) {
//		return welfareEventRepository.getOne(id);
//	}
//
//	@Override
//	public WelfareEvent getOneWelfareEvent(Integer id) {
//		return welfareEventRepository.findById(id).orElse(null);
//	}
//
//	
//	@Override
//	public boolean updateWelfareEvent(Integer id, WelfareEvent welfareEvent) {
//		if(welfareEventRepository.getOne(id) !=null) {
//			welfareEvent.setId(id);
//			welfareEventRepository.save(welfareEvent);
//			return true;
//		}
//		return false;
//	}
//
//	

}


