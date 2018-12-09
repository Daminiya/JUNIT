package com.example.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDetails.Dto.Mapping.LeaveDataToLeave;
import com.example.StudentDetails.Entity.Leave;
import com.example.StudentDetails.Service.LeaveService;
import com.example.StudentDetails.dtoo.LeaveData;

@RestController
public class LeaveController {
	@Autowired
	LeaveService leaveService;

	@PostMapping("/leave")
	public HttpStatus createLeave(@RequestBody LeaveData leaveData) {
		Leave leave = LeaveDataToLeave.mapToLeave(leaveData);
		if (leaveService.createLeave(leave)) {
			return HttpStatus.OK;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@GetMapping("/leave")
	public List<Leave> getAllLeave() {
		return leaveService.getAllLeave();
	}

}
