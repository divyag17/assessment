package innerclass;

public class test {
public static void main(String arg[])
{
	modal m=new modal();
	m.display();
	modal.square m2=m.new square();
	m2.sq();
}
}
