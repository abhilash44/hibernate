package com.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Baby_Croco")
public class Baby {
	@Override
	public String toString() {
		return "Baby [id=" + id + ", name=" + name + ", colour=" + colour + "]";
	}

	@Id
	private int id;
	private String name;
	private String colour;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
