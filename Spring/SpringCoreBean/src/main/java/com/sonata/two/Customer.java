package com.sonata.two;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private Person person;
	private int type;
	private String action;
	
	@Autowired
	public Customer(Person person) {
		this.person=person;
	}
	
	
	public Person getPerson() {
		return person;
	}

    /*@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}*/


	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}


	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action=" + action + "]";
	}
	
	

}
