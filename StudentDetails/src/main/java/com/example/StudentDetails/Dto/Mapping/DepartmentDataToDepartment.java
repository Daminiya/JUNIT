package com.example.StudentDetails.Dto.Mapping;

import com.example.StudentDetails.Entity.Department;
import com.example.StudentDetails.dtoo.DepartmentData;

public class DepartmentDataToDepartment {
	
public static Department mapToDepartment (DepartmentData departmentData) {
	Department department =new Department();
	if (departmentData != null) {
		department.setId(departmentData.getId());
		department.setAddress(departmentData.getAddress());
		department.setDepatmentName(departmentData.getDepatmentName());
		
	}
	return department;

}


}





































//public class DeniedPromotionDataToDeniedPromotion {
//	
//	public static DeniedPromotion mapToDeniedPromotion(DeniedPromotionData deniedPromotionData) {
//		DeniedPromotion deniedPromotion = new DeniedPromotion();
//		if (deniedPromotionData != null) {
//			deniedPromotion.setId(deniedPromotionData.getId());
//			deniedPromotion.setRequsetId(deniedPromotionData.getRequsetId());
//			deniedPromotion.setDesignationId(deniedPromotionData.getDesignationId());
//			deniedPromotion.setDeniedDate(deniedPromotionData.getDeniedDate());
//			deniedPromotion.setDeniedRemark(deniedPromotionData.getDeniedRemark());
//			deniedPromotion.setDeniedBy(deniedPromotionData.getDeniedBy());
//			deniedPromotion.setPosition(deniedPromotionData.getPosition());
//			
//		}
//		return deniedPromotion;
//	}
//
//	