package com.formapi.formapi.Dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.formapi.formapi.Entity.Student;

@Repository
@Qualifier("fakeData")
public class FakeStudentDao implements StudentDao{
     private static Map<Integer, Student> students;
     static {
    	 students = new HashMap<Integer, Student>(){
    		 {
    			 put(1,new Student(1,"vs","vshree@gmu.edu","+1-7034532425"));
    		 }
    	 };
     }
     
     @Override
     public Collection<Student> getAllStudents(){
    	 return this.students.values();
     }

    @Override
	public void insertStudentToDb(Student student) {
		this.students.put(student.getId(), student);
		
	}
}
