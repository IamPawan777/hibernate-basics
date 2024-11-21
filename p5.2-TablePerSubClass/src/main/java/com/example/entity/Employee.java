package com.example.entity;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Employee extends Person {
	private String job;
	private double salary;
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
