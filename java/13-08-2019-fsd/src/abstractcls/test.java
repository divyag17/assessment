package abstractcls;

public class test {
	public static void main(String arg[]) {
		flyer f=new bird();
		f.fly();
		f=new superman();
		f.fly();
	}
}
