package account;

public class accpoint {
	private int a1;
	private String name;
	public accpoint()
	{
		
	}
	public accpoint(int a1,String a2)
	{
		this.a1=a1;
		this.name=a2;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		accpoint p=(accpoint)obj;
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String arg[])
	{
		accpoint p=new accpoint(2,"rani");
		accpoint p1=new accpoint(4,"divya");
		System.out.println(p1==p);
		
		
	}
}

