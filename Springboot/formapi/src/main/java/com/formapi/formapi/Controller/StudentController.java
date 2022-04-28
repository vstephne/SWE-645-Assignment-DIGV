package com.formapi.formapi.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formapi.formapi.Dao.FakeStudentDao;
import com.formapi.formapi.Entity.Student;
import com.formapi.formapi.Service.StudentService;

@RestController
//@RequestMapping("/student")
public class StudentController {
	
	  @Autowired
	  private StudentService studentService;
	  
	  @RequestMapping(value="/getStudentDetails",method =RequestMethod.GET)
	  public Collection<Student> getAllStudents(){
		  return studentService.getAllStudents();
	  }
	  
	  @RequestMapping(value="/putStudentDetails",method =RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	  public void insertStudent(Student student){
		  studentService.insertStudent(student);
	  }
}
