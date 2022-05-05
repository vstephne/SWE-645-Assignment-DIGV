package com.deeksha.Dao;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.deeksha.Entity.Student;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {
	
	private static Map<Integer,Student> students;
	
	static {
		students = new HashMap<Integer,Student>(){
			{
				put(1, new Student(1,"mad","girl","Forest","Milkyway","xyz","1111","22030","xyz@yahoo.com","22-22-2022"));
				put(2, new Student(2,"mad","man","Forest","Milkyway","xyz","11111","22030","xyz@yahoo.com","22-22-2022"));
				put(3, new Student(3,"mad","child","Forest","Milkyway","xyz","11111","22030","xyz@yahoo.com","22-22-2022"));
			}
			
		};
	}
	
	@Override
	public Collection<Student> getAllStudents(){
		return this.students.values();
		
	}
	
	@Override
	public Student getStudentById(int id) {
		return this.students.get(id);
		
	}

	@Override
	public void removeStudentByID(int id) {
	   this.students.remove(id);
		
	}
	
	@Override
	public void updateStudent(Student student) {
		Student s = students.get(student.getId());
		s.setEmail(student.getEmail());
		s.setState(student.getState());
		students.put(student.getId(), student);
		
	}

	@Override
	public void insertStudentDao(Student student) {
         this.students.put(student.getId(), student);
	}
	

}
