package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int quantity;
	private String name;
	private String city;
	private String state;
	private Date  dateCreation;
	private Date  datetUpdate;
	public Item() {
	}
	
	
	public Item(String  name, int quantity) {
		this.name = name;
		this.quantity = quantity;
		this.dateCreation = new Date();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date  getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date  dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date  getDatetUpdate() {
		return datetUpdate;
	}
	public void setDatetUpdate(Date  datetUpdate) {
		this.datetUpdate = datetUpdate;
	}


	public int getQuantity() {
		return quantity;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


 
	
	
	
	
}
