package com.sonata.customqualifier;

public class MyAddress implements AddressInterface {
	
	private int streetNumber = 126;
	private String streetName = "laheriasarai";
	private String city = "dbg";
	private String country = "india";
	
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getWholeAddress() {
		String wholeAddress = "My Address = " + getStreetNumber() + " " +
				getStreetName() + " " +
				getCity() + " " +
				getCountry();
		return wholeAddress;
	}
}
