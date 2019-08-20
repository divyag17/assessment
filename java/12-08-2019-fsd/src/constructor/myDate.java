package constructor;

public class myDate {
	private int day;
	private int month;
	private int year;
	public myDate()
	{
		this(10);
	}
	public myDate(int i) {
		this.day=i;
		
	}
	public myDate(int i,int j,int k)
	{
		this.day=i;
		this.month=j;
		this.year=k;
		
	}
	public static void main(String arg[]) {
		myDate date=new myDate(20);
		myDate two=new myDate();
		
	}
	
}

