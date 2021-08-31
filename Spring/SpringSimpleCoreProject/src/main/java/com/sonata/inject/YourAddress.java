package com.sonata.inject;
public class YourAddress implements AddressInterface {
	
	private int streetNumber = 115;
	private String streetName = "dasaut";
	private String city = "samastipur";
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
		String wholeAddress = "Your Address = " + getStreetNumber() + " " +
				getStreetName() + " " +
				getCity() + " " +
				getCountry();
		return wholeAddress;
	}
}
