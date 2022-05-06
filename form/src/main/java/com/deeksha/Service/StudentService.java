package com.deeksha.Service;
import com.deeksha.Dao.StudentDao;
import com.deeksha.Entity.Student;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
   @Autowired
   @Qualifier("sql")
	private StudentDao studentDao;

	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
		
}
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
		
	}
	public void removeStudentById(int id) {
		this.studentDao.removeStudentByID(id);
		
	}
	public void updateStudent(Student student) {
		this.studentDao.updateStudent(student);
		
		
	}
	public void insertStudent(Student student) {
		studentDao.insertStudentDao(student);
	}
	
}
 