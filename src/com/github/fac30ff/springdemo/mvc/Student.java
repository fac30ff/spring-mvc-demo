package com.github.fac30ff.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String country2;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("NL", "Dutch");
		countryOptions.put("ES", "Spain");
		countryOptions.put("DK", "Danmark");
		countryOptions.put("SE", "Sverige");
		countryOptions.put("FR", "France");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public String getCountry2() {
		return country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
