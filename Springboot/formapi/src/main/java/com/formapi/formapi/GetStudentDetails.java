package com.formapi.formapi;

public class GetStudentDetails {
    private  long student_id = 0;
    private String name = "";
    
    public GetStudentDetails(long student_id,String name) {
    	this.student_id= student_id ;
    	this.name=name;
    }
    
    public long getId() {
    	return student_id;
    }
    public  String getName() {
    	return name;
    }
}
