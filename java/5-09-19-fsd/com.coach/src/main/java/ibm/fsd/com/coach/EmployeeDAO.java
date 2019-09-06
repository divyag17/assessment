package ibm.fsd.com.coach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import ibm.fsd.com.thecoach.EmployeeRowMapper;
import ibm.fsd.com.thecoach.employee;
public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createEmployee(employee employee)
	{
		String query="insert into employee(id,firstname,lastname,email) values(?,?,?,?)";
		Object obj[]= {employee.getId(),employee.getFirstname(),employee.getLastname(),employee.getEmail()};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	public void deleteEmployee(int id)
	{
		String query="delete from employee where id=(?)";
		Object obj[]= {id};
		jdbcTemplate.update(query,obj);
		System.out.println("delete done");
	}
	public List<employee> getAllEmployee()
	{
		return jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
	}
	
}
