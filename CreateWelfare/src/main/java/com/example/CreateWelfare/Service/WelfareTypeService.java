package com.example.CreateWelfare.Service;

import java.util.List;

import com.example.CreateWelfare.Entity.WelfareType;

public interface WelfareTypeService {
	boolean addWelfareType(WelfareType welfareType);

	List<WelfareType> getAllWelfareType();

	boolean editWelfareType(WelfareType WelfareType);

	boolean deleteWelfareType(Integer id);

	WelfareType getById(Integer id);

}
