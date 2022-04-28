package com.formapi.formapi.Dao;

import java.util.Collection;

import com.formapi.formapi.Entity.Student;

public interface StudentDao {
	 Collection<Student> getAllStudents();
	
	 void insertStudentToDb(Student student);
} 
