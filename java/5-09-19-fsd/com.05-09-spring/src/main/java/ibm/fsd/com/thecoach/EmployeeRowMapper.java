package ibm.fsd.com.thecoach;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class EmployeeRowMapper implements RowMapper<employee> {

	public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		employee employee=new employee();
		employee.setId(rs.getInt(1));
		employee.setFirstname(rs.getString(2));
		employee.setLastname(rs.getString(3));
		employee.setEmail(rs.getString(4));
		return employee;
	}
}
