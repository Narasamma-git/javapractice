package com.technoelevate.stdbmanagement.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.stdbmanagement.dto.Student;
@Component
public class StudentDaoImpl implements StudentDao {
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Student> getAllStudent() {
		RowMapper<Student> row=new RowMapperImpl();
		String query="SELECT * FROM studentdb.student";
		List<Student> std=template.query(query, row);
		return std;
	}
	

	@Override
	public Student getStudent(int id) {
		
		return null;
	}

	@Override
	public boolean addStudent(Student std, int id, String name, String password) {
		
		return false;
	}

	@Override
	public boolean updateStudent(int id) {
		
		return false;
	}

	@Override
	public boolean deleteStudent(int sid) {
		String qry="DELETE FROM studentdb.student WHERE id=?";
		template.update(qry,sid);
		return true;
	}

	
	

	
}
