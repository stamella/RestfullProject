package com.capgemini.customerapp1.entity;

public class Address {
	
	private int doorNumber;
	private String streetName;
	private String city;
	private String state;
	private long zipcode;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorNumber, String streetName, String city, String state, long zipcode, String country) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", zipcode=" + zipcode + ", country=" + country + "]";
	}
	
	
	

}
