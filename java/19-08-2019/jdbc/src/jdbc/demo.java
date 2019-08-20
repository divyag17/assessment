package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import java.sql.Statement;

public class demo {
	private static Properties p=null;
	public demo()
	{
		super();
	}
	static {
		p=new Properties();
		p.put("url","jdbc:mysql://localhost:3306/ibm");
		p.put("USER","root");
		p.put("PASSWORD","divyarani@9080851g");
	}
public static void main(String arg[]) throws ClassNotFoundException,SQLException
{
	//DriverManager.registerDriver(new org.h2.Driver());
	//Class.forName("org.h2.Driver");
	//Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("USER"),p.getProperty("PASSWORD"));
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "divyarani@9080851g");

	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from sample");
	while(rs.next())
	{
		System.out.printf("%d %s",rs.getInt(0),rs.getString(1));
	}
	
}
}
