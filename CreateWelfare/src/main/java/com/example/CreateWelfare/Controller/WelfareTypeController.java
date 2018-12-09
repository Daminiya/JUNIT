package com.example.CreateWelfare.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CreateWelfare.Entity.WelfareType;
import com.example.CreateWelfare.Service.WelfareTypeService;

@RestController
public class WelfareTypeController {
	@Autowired
	private WelfareTypeService welfareTypeService;

	@PostMapping("/welfaretype")
	public HttpStatus createWelfareType(@Valid @RequestBody WelfareType welfareType) {
		boolean test = welfareTypeService.addWelfareType(welfareType);
		if (test) {
			return HttpStatus.CREATED;

		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/welfareType")
	public ResponseEntity<List<WelfareType>> getWelfareType() {
		List<WelfareType> welfareType = welfareTypeService.getAllWelfareType();
		ResponseEntity<List<WelfareType>> response = new ResponseEntity<>(welfareType, HttpStatus.OK);
		return response;
	}

	@GetMapping("/welfaretype/{Id}")
	public WelfareType getOneById(@PathVariable("Id") Integer id) {
		return welfareTypeService.getById(id);
	}

	@PostMapping("/welfaretype")
	public HttpStatus editWelfareType(@RequestBody WelfareType welfareType) {
		boolean test = welfareTypeService.editWelfareType(welfareType);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/welfaretype/{id}")
	public HttpStatus deleteWelfareType(@PathVariable("id") Integer Id) {
		boolean test = welfareTypeService.deleteWelfareType(Id);
		HttpStatus status;
		if (test) {
			return HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return status;
	}
}
