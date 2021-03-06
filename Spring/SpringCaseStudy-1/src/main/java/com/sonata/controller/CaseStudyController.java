package com.sonata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sonata.DAOimpl.CaseStudyImpl;
import com.sonata.DAOimpl.CaseStudyImpl1;

import com.sonata.model.Login;
import com.sonata.model.Task;

import com.sonata.model.User;



@RestController
public class CaseStudyController {

	@Autowired
	private CaseStudyImpl1 taskService;
	
	@GetMapping(value="/task")
	public List<Task> getTask(){
		return taskService.getAllTask();
	}
	@RequestMapping("/task/{id}")
	public Task getTask(@PathVariable int id) {
		return taskService.getAllTask().stream().filter(t->t.getTaskId()==id).findFirst().get();
		
	}
	
	@GetMapping(value="/login")
	public List<Login> getLogin(){
		return taskService.getAllDetails();
	}
	@RequestMapping("/login/{id}")
	public Login getLogin(@PathVariable int id) {
		return taskService.getAllDetails().stream().filter(t->t.getUserid()==id).findFirst().get();
	}
	@GetMapping(value="/test")
	public String test() {
		return "testing done!!!";
	}
	
	@GetMapping(value="/user")
	public List<User> getUser(){
		return taskService.getAllUser();
	}
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
		return taskService.getAllUser().stream().filter(t->t.getUserId()==id).findFirst().get();
	}
	

}
