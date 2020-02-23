package com.example.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String role;

	Employee() {
	}

	Employee(String firstName, String lastName, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setId(Long Id) {
		this.id = Id;
	}
	
	public void setName(String name) {
		String[] parts = name.split(" ");
		this.firstName = parts[0];
		this.lastName = parts[1];
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}