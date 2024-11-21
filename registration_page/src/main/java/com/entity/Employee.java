package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_id;
	
	private String e_name;
	
	private String e_email;
	
	private String e_department;
	
	private String e_salary;
	
	private String e_password;	

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_email() {
		return e_email;
	}

	public void setE_email(String e_email) {
		this.e_email = e_email;
	}

	public String getE_password() {
		return e_password;
	}

	public void setE_password(String e_password) {
		this.e_password = e_password;
	}

	public String getE_department() {
		return e_department;
	}

	public void setE_department(String e_department) {
		this.e_department = e_department;
	}

	public String getE_salary() {
		return e_salary;
	}

	public void setE_salary(String e_salary) {
		this.e_salary = e_salary;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String e_name, String e_email, String e_password, String e_department, String e_salary) {
		super();
		this.e_name = e_name;
		this.e_email = e_email;
		this.e_password = e_password;
		this.e_department = e_department;
		this.e_salary = e_salary;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_email=" + e_email + ", e_password=" + e_password
				+ ", e_department=" + e_department + ", e_salary=" + e_salary + "]";
	}
	
	
	
	

}
