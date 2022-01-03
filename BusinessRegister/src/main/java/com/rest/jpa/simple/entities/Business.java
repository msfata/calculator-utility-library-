package com.rest.jpa.simple.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@javax.persistence.Entity
@Table
@Data
@NoArgsConstructor
public class Business {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String businessName;
	@Column(nullable = false)
	private String businessType;
	@Column(nullable = false)
	private String businessTurnover;
	@Column(nullable = false)
	private String businessContact;

}
