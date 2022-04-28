package com.formapi.formapi.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.formapi.formapi.Entity.Student;

@Repository
@Qualifier("mysql")
public class StudentImpl  implements StudentDao{
  
  @Autowired
  private JdbcTemplate jdbcTemplate;
  
  @Override
  public Collection<Student> getAllStudents(){
	  final String sql = "SELECT * FROM Student";
	  //SELECT LastName FROM Employees
	  List<Student> students= jdbcTemplate.query(sql,  new RowMapper<Student>() {
		  public Student mapRow(ResultSet resultSet, int i) throws SQLException {
			  Student student = new Student();
			  student.setId(resultSet.getInt("id"));
			  student.setName(resultSet.getString("name"));
			  student.setEmail(resultSet.getString("email"));
			  student.setPhone_number(resultSet.getString("phone"));
			  
			  return student;
		  }
	  });
	 // System.out.println("***************************"+students.size());
 	 return students;
  }

@Override
public void insertStudentToDb(Student student) {
	// TODO Auto-generated method stub
	final String sql = "INSERT INTO  test1.Student values(?,?,?,?)";
	final String name= student.getName();
	final int id=student.getId();
	final String email=student.getEmail();
	final String phone = student.getPhone_number();
	  
	 jdbcTemplate.update(sql,new Object[] {id,name,email,phone} );
}
  
}
