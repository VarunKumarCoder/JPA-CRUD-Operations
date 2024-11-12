package com.cdc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "JPA_DOCTOR_INFO")
public class Doctor {
	@Id
	@Column(name = "DOC_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docId;
	@Column(name = "DOC_NAME", length = 25)
	private String docName;
	@Column(name = "DOC_SPEZ", length = 20)
	private String docSpecialization;
	@Column(name = "DOC_INCOME")
	private Double docIncome;
}
