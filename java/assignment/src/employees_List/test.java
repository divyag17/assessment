package employees_List;

import java.util.Scanner;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Set<Employee> list=new TreeSet<Employee>();
		List<EmployeesBO> list1=new ArrayList<EmployeesBO>();
		System.out.println("input the number of employees:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the details of "+i+" employee");
			int id=i;
			String name=scanner.next();
			String department=scanner.next();
			int age=scanner.nextInt();
			int sal=scanner.nextInt();
			String doj=scanner.next();
			Date d=new SimpleDateFormat("mm/DD/yyyy").parse(doj);
			Employee e=new Employee(id,age,sal,name,department,d);
			EmployeesBO e1=new EmployeesBO(id,age,sal,name,department,d);
			list.add(new Employee(id,age,sal,name,department,d));
			list1.add(new EmployeesBO(id,age,sal,name,department,d));
			
		}
		System.out.println("1.Sort by salary");
		System.out.println("2.Sort by age and date of joining");
		int choice =scanner.nextInt();
		switch(choice)
		{
		case 1:
			for(Employee e:list )
			{   
				System.out.println(e);
			}
			
			
			break;
		case 2:
			for(EmployeesBO e:list1 )
			{
				System.out.println(e.toString());
			}
			break;
		}
	}

}
