package date.client;
import sample.date;
public class tester {
	public static void main(String arg[])
	{
		date mydate=new date();
		mydate.setDay(30);
		mydate.setMonth(12);
		mydate.setYear(2019);
		System.out.println(mydate.getDetails());
	}
}
