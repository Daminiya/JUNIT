package com.example.StudentDetails.Dto.Mapping;

import com.example.StudentDetails.Entity.Leave;
import com.example.StudentDetails.dtoo.LeaveData;

public class LeaveDataToLeave {
	public static Leave mapToLeave(LeaveData leavedata ) {
		Leave leave=new Leave();
		if (leavedata != null) {
			leave.setId(leavedata.getId());
		}
		return leave;
	}
	


}
