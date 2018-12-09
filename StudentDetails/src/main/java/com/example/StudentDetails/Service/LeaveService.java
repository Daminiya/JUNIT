package com.example.StudentDetails.Service;

import java.util.List;

import com.example.StudentDetails.Entity.Leave;

public interface LeaveService {
	
	boolean createLeave(Leave leave);
	Leave getOneLeave(Integer id);
	List<Leave> getAllLeave();
	boolean updateLeave(Integer id , Leave leave);
	boolean deleteLeave(Integer id);
}


