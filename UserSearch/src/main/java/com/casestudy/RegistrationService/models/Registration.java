package com.casestudy.RegistrationService.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registrations")
public class Registration {

	private String id;
	private String username;
	private String password;
	private String confirmpassword;
	private String fullname;
	private String gender;
	private String dateofbirth;
	private String email;
	private long phonenumber;
	private String doornumber;
	private String street;
	private String city;
	private int zipcode;
	private String state;
	private String country;

	public Registration(String id, String username, String password, String confirmpassword, String fullname,
			String gender, String dateofbirth, String email, long phonenumber, String doornumber, String street,
			String city, int zipcode, String state, String country) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.fullname = fullname;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.email = email;
		this.phonenumber = phonenumber;
		this.doornumber = doornumber;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", username=" + username + ", password=" + password + ", confirmpassword="
				+ confirmpassword + ", fullname=" + fullname + ", gender=" + gender + ", dateofbirth=" + dateofbirth
				+ ", email=" + email + ", phonenumber=" + phonenumber + ", doornumber=" + doornumber + ", street="
				+ street + ", city=" + city + ", zipcode=" + zipcode + ", state=" + state + ", country=" + country
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getDoornumber() {
		return doornumber;
	}

	public void setDoornumber(String doornumber) {
		this.doornumber = doornumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
