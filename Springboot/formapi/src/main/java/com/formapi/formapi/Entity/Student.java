package com.formapi.formapi.Entity;

public class Student {
      private int id;
      private String name;
      private String email;
      private String phone_number;
      
	
//      private String City;
//      private  String State;
//      private String zip;
//      private String DOS;
      
      public Student(int id, String name, String email,String phone_number) {
    	  this.id = id;
    	  this.name=name;
    	  this.email=email;
    	  this.phone_number= phone_number;
    	  
      }
      public Student() {
    	  
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
  	public String getEmail() {
  		return email;
  	}
  	public void setEmail(String email) {
  		this.email = email;
  	}
  	public String getPhone_number() {
  		return phone_number;
  	}
  	public void setPhone_number(String phone_number) {
  		this.phone_number = phone_number;
  	}
      
}
