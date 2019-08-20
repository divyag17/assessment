package sample.client;
import sample.date;
public class Tester {
	public static void main(String arg[])
	{
		date myDate=new date();
		myDate.createDate(30, 12,2017);
		System.out.print(myDate.getDetails());
		
	}
}
