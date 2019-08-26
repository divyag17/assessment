package networkjdbc;
import java.sql.*;

import factory.MyConnectionFactory;
public class RsEXample {
private MyConnectionFactory factory;
private Connection connection;
public RsEXample(MyConnectionFactory factory, Connection connection) {
	super();
	this.factory = factory;
	this.connection = connection;
}
public RsEXample() throws SQLException {
	factory=MyConnectionFactory.createObject();
	connection=factory.getConnection();
}
public ResultSet getEmployeeById(int id) throws SQLException

{
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery("select id as id, firstname as firstname,lastname as lastname,email as email from employee where id="+id);
	return rs;
}
 
}
