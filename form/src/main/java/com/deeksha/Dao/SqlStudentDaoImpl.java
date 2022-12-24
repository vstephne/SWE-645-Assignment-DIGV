package com.deeksha.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.deeksha.Entity.Student;

@Repository
@Qualifier("sql")
public class SqlStudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Collection<Student> getAllStudents() {
		 final String sql="SELECT * FROM deeksha.Student";
		List<Student> students = (List<Student>) jdbcTemplate.query(sql,new RowMapper<Student>() {

			public Student mapRow(ResultSet resultSet,int i) throws SQLException
				 {
					  Student student = new Student();
					  student.setId(resultSet.getInt("id"));
				   student.setFirstname(resultSet.getString("firstname"));
					  student.setLastname(resultSet.getString("lastname"));
					  student.setEmail(resultSet.getString("email"));
					  student.setPhone(resultSet.getString("phone"));
					  student.setAddress(resultSet.getString("address"));
					 student.setZipcode(resultSet.getString("zipcode"));
					 student.setCity(resultSet.getString("city"));
					 student.setDate(resultSet.getString("dateofsurvey"));
					 student.setState(resultSet.getString("state"));
				//	 String s = resultSet.getString("favfeature"); 
//					 String[] fav_feature= s.split(",");
//					 System.out.println("***************************************"+fav_feature[0]+"     "+fav_feature[1]);
//					 student.setfav_feature(fav_feature);
					 student.setfav_feature(resultSet.getString("favfeature"));
					 student.setinterest(resultSet.getString("interest"));
					 student.setlikelihood(resultSet.getString("likelihood"));
					 student.setcomments(resultSet.getString("comments"));
					 student.setraffle(resultSet.getInt("raffle"));
					  return student;
					  
				
			}

			/*
			 * @Override public Student extractData(ResultSet rs) throws SQLException,
			 * DataAccessException { // TODO Auto-generated method stub return null; }
			 */
			 
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
		final String sql = "INSERT INTO  deeksha.Student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		final int id=student.getId();
		final String firstName= student.getFirstname();
		final String lastName = student.getLastname();
		final String address = student.getAddress();
		final String city = student.getCity();
		final String zipcode = student.getZipcode();
		final String email=student.getEmail();
		final String phone = student.getPhone();
		final String state = student.getState();
		final String dateofsurvey = student.getDate();
		final String favfeature = student.getfav_feature();
		final String interest = student.getinterest();
		final String likelihood=student.getlikelihood();
		final String comments=student.getcomments();
		final int raffle=student.getraffle();
		
		  
		 
		 jdbcTemplate.update(sql,new Object[] {id,firstName,lastName,email,phone,address,city,zipcode,dateofsurvey,favfeature,interest,likelihood,raffle,comments,state});
	}

}
