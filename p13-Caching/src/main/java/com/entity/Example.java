package com.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable
@Cache (usage = CacheConcurrencyStrategy.READ_ONLY)
public class Example {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Example(int id, String name, int mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "name=" + name + "  ||  mobile=" + mobile;
	}
	
	
}
