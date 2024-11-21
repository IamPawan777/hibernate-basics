package com.example.entity;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Student {

//	private static final long serialVersionUID = 1L;

	private int roll;
	private String name;
	private float marks;

	public Student() {
		super();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
}
