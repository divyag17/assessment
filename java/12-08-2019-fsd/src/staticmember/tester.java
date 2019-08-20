package staticmember;

public class tester {
public static void main(String arg[])
{
	book b1=new book();
	b1.set(3,"sp");
	System.out.println(b1.get());
	
	tv t1=new tv();
	t1.set("samsung");
	System.out.println(t1.get());
	
	
}
}
