package com.example.StudentDetails.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDetails.Entity.Leave;
import com.example.StudentDetails.Repository.LeaveRepository;
import com.example.StudentDetails.Service.LeaveService;

@Service
public class LeaveServiceImpl implements LeaveService {
	@Autowired
	private LeaveRepository leaveRepository;

	@Override
	public boolean createLeave(Leave leave) {
		leaveRepository.save(leave);
		return true;
	}

	@Override
	public Leave getOneLeave(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Leave> getAllLeave() {
		return leaveRepository.findAll();
	}

	@Override
	public boolean updateLeave(Integer id, Leave leave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteLeave(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
