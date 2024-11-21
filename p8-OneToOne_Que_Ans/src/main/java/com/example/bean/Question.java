package com.example.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "Question")
public class Question {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int q_id;
	private String q_name;
	
	@OneToOne
	private Answer ans;
}
