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
@Table (name = "OTOAddress")
public class Address {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int adr;
	private String country, state, city;
	
	@OneToOne(mappedBy = "address")
	private Person person;
}
