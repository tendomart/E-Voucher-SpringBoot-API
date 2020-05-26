package com.management.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(	name = "register_merchant"
//, 
//uniqueConstraints = { 
//		@UniqueConstraint(columnNames = "username"),
//		@UniqueConstraint(columnNames = "password") 
//	})
)


public class RegisterMerchant implements Serializable{

	public RegisterMerchant() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@NotBlank
//	@Size(max = 20)
	private String nationalIdentificationNumber;

	 public RegisterMerchant(Long id, String nationalIdentificationNumber, String name_of_beneficiary, String mobile_number,
		double amount_equivalence_voucher, Date planned_date_of_food_delivery, String district, String sub_county,
		String parish, String village, String point_of_collection) {
	super();
	this.id = id;
	this.nationalIdentificationNumber = nationalIdentificationNumber;
	this.name_of_beneficiary = name_of_beneficiary;
	this.mobile_number = mobile_number;
	this.amount_equivalence_voucher = amount_equivalence_voucher;
	this.planned_date_of_food_delivery = planned_date_of_food_delivery;
	this.district = district;
	this.sub_county = sub_county;
	this.parish = parish;
	this.village = village;
	this.point_of_collection = point_of_collection;
}
	private String name_of_beneficiary;
	 private String mobile_number;
	 private double amount_equivalence_voucher;
	 private Date planned_date_of_food_delivery;
	 public String district;
	 public String sub_county;
	 public String parish;
	 public String village;
	 public String point_of_collection;
	 
//	@NotBlank
//	@Size(max = 250)
//	private String password;
	
}
