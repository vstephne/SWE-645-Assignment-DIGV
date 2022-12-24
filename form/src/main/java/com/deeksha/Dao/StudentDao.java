package com.deeksha.Dao;

import java.util.Collection;

import com.deeksha.Entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void removeStudentByID(int id);

	void updateStudent(Student student);

	void insertStudentDao(Student student);

}