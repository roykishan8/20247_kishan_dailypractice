package com.sonata.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.DAOimpl.EmployeeImpl;
import com.sonata.model.Employee;
@RestController
public class jdbcController {
	
	@Autowired
	private EmployeeImpl empService;
	
	@GetMapping(value="/emp")
	public List<Employee> getEmp(){
		return empService.getAllEmployee();
	}
	


}
