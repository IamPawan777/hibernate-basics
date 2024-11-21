package com.example.entity;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Student extends Person {
	private String course;
	private int fees;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
}
