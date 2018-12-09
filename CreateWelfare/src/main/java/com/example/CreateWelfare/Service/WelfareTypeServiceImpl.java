package com.example.CreateWelfare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CreateWelfare.Entity.WelfareType;
import com.example.CreateWelfare.Repository.WelfareTypeRepository;


@Service
public class WelfareTypeServiceImpl implements WelfareTypeService {
	@Autowired
	private WelfareTypeRepository welfareTypeRepository;

	@Override
	public boolean addWelfareType(WelfareType welfareType) {
		welfareTypeRepository.save(welfareType);
		return true;
	}

	@Override
	public List<WelfareType> getAllWelfareType() {
		return welfareTypeRepository.findAll();
	}

	@Override
	public boolean editWelfareType(WelfareType welfareType) {
		boolean success = false;
		if(welfareTypeRepository.getOne(welfareType.getId()) != null) {
			welfareTypeRepository.save(welfareType);
			success = true;
		}
		return success;
	}

	@Override
	public boolean deleteWelfareType(Integer id) {
		WelfareType welfareType=welfareTypeRepository.getOne(id);
		if (welfareType.getId() == (id)) {
			welfareTypeRepository.deleteById(id);
			return true;
		}
		return false;
}

	@Override
	public WelfareType getById(Integer id) {
		return welfareTypeRepository.getOne(id);
	}

}
