package com.example.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "Answer")
public class Answer {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int a_id;
	private String a_name;	
	
	@OneToOne
	private Question que;
	
}
