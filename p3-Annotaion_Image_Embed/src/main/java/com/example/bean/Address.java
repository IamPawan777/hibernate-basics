package com.example.bean;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {

	private String country, state, city;
}
