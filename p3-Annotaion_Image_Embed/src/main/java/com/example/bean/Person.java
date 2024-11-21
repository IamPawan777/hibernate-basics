package com.example.bean;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "AnnotationTable")
public class Person {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "Person Name", unique = true)
	private String name;
	
	@Column (unique = true)
	private String mobile;
	
	private String pass;
	
	@Lob
	@Column(length = 120000)
	private byte[] pice;
	
	@Temporal(TemporalType.DATE)
	private Date registerTime;
	
	@Transient
	private String profile;
	
	private boolean status;
	
	@Embedded
	private Address address;
}
