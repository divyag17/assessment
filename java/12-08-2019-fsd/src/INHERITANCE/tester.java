package INHERITANCE;

public class tester {
	public static void main(String arg[])
	{
		
		permanentEmployee e1=new permanentEmployee(90000);
		System.out.println(e1.getDetails());
		contractedEmployee e2=new contractedEmployee(80);
		System.out.println(e2.getDetails());
		
	}
}
