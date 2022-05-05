package com.deeksha.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.deeksha.Entity.Student;

@Repository
@Qualifier("sql")
public class SqlStudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Collection<Student> getAllStudents() {
		 final String sql="SELECT * FROM Studentsurvey";
		List<Student> students = (List<Student>) jdbcTemplate.query(sql,new RowMapper<Student>() {

			public Student mapRow(ResultSet resultSet,int i) throws SQLException
				 {
					  Student student = new Student();
					  student.setId(resultSet.getInt("id"));
				   student.setFirstname(resultSet.getString("fname"));
					  student.setLastname(resultSet.getString("lname"));
					  student.setEmail(resultSet.getString("email"));
					  student.setPhone(resultSet.getString("phone"));
					  student.setAddress(resultSet.getString("address"));
					  student.setCity(resultSet.getString("address"));
					 student.setZipcode(resultSet.getString("zipcode"));
					 student.setCity(resultSet.getString("city"));
					//  student.setDate(resultSet.getString("date"));
					  return student;
				
			}

			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return null;
			}
			 
		 });
		return students;
	}
   

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudentByID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertStudentDao(Student student) {
		// TODO Auto-generated method stub
		
	}

}
