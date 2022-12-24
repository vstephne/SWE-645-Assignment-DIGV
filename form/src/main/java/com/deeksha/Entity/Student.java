package com.deeksha.Entity;

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
	private String likelihood;
	private String fav_feature;
	private String interest;
	private int raffle;
	private String comments;
	
	
	
	public Student(int id, String firstname, String lastname, String address, String city, String state, String phone,
			String zipcode, String email, String date,String likelihood,String[] fav_feature,String interest, int raffle,String commnets ) {
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
		// TODO Auto-generated constructor stub
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
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setlikelihood(String likelihood) {
		this.likelihood = likelihood;
	}
	public String getlikelihood() {
		return likelihood;
	}
	public void setfav_feature(String fav_feature) {
		this.fav_feature = fav_feature;
	}
	public String getfav_feature() {
		return fav_feature;
	}
	public void setinterest(String interest) {
		this.interest = interest;
	}
	public String getinterest() {
		return interest;
	}
	public void setraffle(int raffle) {
		this.raffle = raffle;
	}
	public int getraffle() {
		return raffle;
	}
	public void setcomments(String comments) {
		this.comments = comments;
	}
	public String getcomments() {
		return comments;
	}
	
	


}
