package com.example.bean;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "UpdateData")
@DynamicUpdate
public class Person {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	private String mobile;

}
