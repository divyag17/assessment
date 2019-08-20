package abstractcls;

public class testline {
public static void main(String arg[])
{
	model m1=new line(2,9);
	model m2=new line(0,20);
	System.out.println(m1.isGreater(m1, m2));
	System.out.println(m1.islesser(m1, m2));
	System.out.println(m1==m2);
}
}
