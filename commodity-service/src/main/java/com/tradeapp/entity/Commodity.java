package com.tradeapp.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "commodity")
public class Commodity {
	@Id
	private Long id;
	private String name;
	private double price;
	private String description;
	private Date creationDate;
	private Date modifiedDate;
	private boolean active;
	
	public Commodity() {
		
	}

	public Commodity(Long id, String name, double price, String description, Date creationDate, Date modifiedDate,
			boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
