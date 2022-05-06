package com.deeksha.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deeksha.Entity.Student;
import com.deeksha.Service.StudentService;
@RestController
//@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@CrossOrigin
	@RequestMapping(value="/Getstudents",method = RequestMethod.GET)

	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
 
}

	@RequestMapping(value ="/students/{id}", method =RequestMethod.GET)	
	public Student getStudentByID(@PathVariable("id")int id)
	{
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value ="students/{id}", method =RequestMethod.DELETE)	
	public void deleteStudentByID(@PathVariable("id")int id)
	{
		studentService.removeStudentById(id);
	}
	@RequestMapping(value="/students",method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	
	public void updateStudent(@RequestBody Student student)
	{
		studentService.updateStudent(student);
	}
	@CrossOrigin
	@RequestMapping(value="/putstudents",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student)
	{
		studentService.insertStudent(student);
	}

	
} 
