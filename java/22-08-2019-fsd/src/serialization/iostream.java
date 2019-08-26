package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class iostream {
public static void main(String arg[])

{
	Employee emp=new Employee("1","sachin","chennai");
	try {
		FileOutputStream out= new FileOutputStream("employee.out");
		ObjectOutputStream oos=new ObjectOutputStream(out);
		oos.writeObject(emp);
		oos.flush();
	}
	catch(Exception e)
	{
		
	}
	try {
		FileInputStream out= new FileInputStream("employee.out");
		ObjectInputStream ois=new ObjectInputStream(out);
		emp=(Employee)ois.readObject();
		
	}
	catch(Exception e)
	{
		
	}
	System.out.println("employe ..: "+emp);
}
}
