package exceptions;
import java.util.Scanner;
public class testperson {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String arg[])
	{
		person p=new person();
		String fname,lname;
		
		try {
			System.out.println();
			fname=scanner.next();
			lname=scanner.next();
			p.check(fname,lname);
		}
		catch(NameNotValidException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
}
