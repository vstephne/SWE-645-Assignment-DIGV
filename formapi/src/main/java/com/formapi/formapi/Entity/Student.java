package com.formapi.formapi.Entity;

public class Student {
	private int id;
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String phone;
	private String zipcode;
	private String email;
	private String date;
      
      public Student(int id, String name, String email,String phone_number) {
    	this.id = id;
  		this.firstname = firstname;
  		this.lastname = lastname;
  		this.address = address;
  		this.city = city;
  		this.state = state;
  		this.phone = phone;
  		this.zipcode = zipcode;
  		this.email = email;
  		this.date = date;
    	  
      }
      public Student() {
    	  
      }
      public int getId() {
  		return id;
  	}
  	public void setId(int id) {
  		this.id = id;
  	}
  	public String getFirstname() {
  		return firstname;
  	}
  	public void setFirstname(String firstname) {
  		this.firstname = firstname;
  	}
  	public String getLastname() {
  		return lastname;
  	}
  	public void setLastname(String lastname) {
  		this.lastname = lastname;
  	}
  	public String getAddress() {
  		return address;
  	}
  	public void setAddress(String address) {
  		this.address = address;
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
  	public String getPhone() {
  		return phone;
  	}
  	public void setPhone(String phone) {
  		this.phone = phone;
  	}
  	public String getZipcode() {
  		return zipcode;
  	}
  	public void setZipcode(String zipcode) {
  		this.zipcode = zipcode;
  	}
  	public String getEmail() {
  		return email;
  	}
  	public void setEmail(String email) {
  		this.email = email;
  	}
  	public String getDate() {
  		return date;
  	}
  	public void setDate(String date) {
  		this.date = date;
  	}
      
}
