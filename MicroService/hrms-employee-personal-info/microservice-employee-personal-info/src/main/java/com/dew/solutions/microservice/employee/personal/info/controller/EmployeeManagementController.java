package com.dew.solutions.microservice.employee.personal.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dew.solutions.microservice.config.controller.GenericCrudController;
import com.dew.solutions.microservice.config.dto.EmployeePersonalInfoDto;
import com.dew.solutions.microservice.employee.personal.info.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeManagementController extends GenericCrudController<EmployeePersonalInfoDto, IEmployeeService> {

	private IEmployeeService iEmployeeService;

	@Autowired
	public EmployeeManagementController(IEmployeeService iEmployeeService) {
		super(iEmployeeService);
		this.iEmployeeService = iEmployeeService;

	}
}
