package com.formapi.formapi.Service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.formapi.formapi.Dao.StudentDao;
import com.formapi.formapi.Entity.Student;

@Service
public class StudentService {
	
   @Autowired
   @Qualifier("mysql")
  private StudentDao studentDao ;
	
  public Collection<Student> getAllStudents(){
	  return this.studentDao.getAllStudents();
  }
  
  public void insertStudent(Student student) {
	  this.studentDao.insertStudentToDb(student);
  }
}
