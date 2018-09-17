package com.azizi.CarRental.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
//hibernate add extra implementation to the class so we ignore them with this annotation
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Car {
	//primary key as we use @id and the generated value as AI
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String name ; 
	private String email ; 
	private String phone;
	private String model ;
	private String serialNumber;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy")
	private Date rentalDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy")
	private Date deliveryDate;
	private BigDecimal rentalPrice;
	
	private boolean contact;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}
	public BigDecimal getRentalPrice() {
		return rentalPrice;
	}
	public void setRentalPrice(BigDecimal rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
	
	
	public boolean isContact() {
		return contact;
	}
	public void setContact(boolean contact) {
		this.contact = contact;
	}

}
