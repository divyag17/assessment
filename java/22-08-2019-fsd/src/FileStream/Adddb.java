package FileStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Adddb {
	public static void main(String arg[]) throws SQLException
	{
		BufferedReader reader;
		BufferedWriter writer;
		try {
			reader=new BufferedReader(new FileReader("userdata.txt"));
			
			String line=reader.readLine();
			
			while(line!=null)
			{    
				
				String[] str=line.split(" ");
				Employee e=new Employee((Integer.parseInt(str[0])),str[1],str[2],str[3]);
				EmployeeService service=new EmployeeServiceImpl();
				service.createEmployee(e);
				line=reader.readLine();
				System.out.println(line);
			}
			
			reader.close();
			
		}
		catch(IOException e)
		{
			
		}
		
		
	
	}
}
