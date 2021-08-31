package com.sonata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sonata.DAOimpl.CaseStudyImpl;
import com.sonata.DAOimpl.CaseStudyImpl1;
import com.sonata.model.Task;



@RestController
public class CaseStudyController {

	@Autowired
	private CaseStudyImpl1 taskService;
	
	@GetMapping(value="/task")
	public List<Task> getTask(){
		return taskService.getAllTask();
	}
	
	@GetMapping(value="/test")
	public String test() {
		return "testing done!!!";
	}

}
