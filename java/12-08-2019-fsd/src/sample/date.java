package sample;

public class date {
	private int day;
	private int month;
	private int year;
	public void createDate(int d,int m,int y) {
		
		if(d>30)
		{
			System.out.println("date cannot be 30");
			System.exit(0);
		}
		if(m>12)
		{
			System.out.println("month cannot b more than 12");
			System.exit(0);
		}
		if(y>2019 && y<1990)
		{
			System.out.println("invalid year");
			System.exit(0);
		}
		
		day=d;
		month=m;
		year=y;
	}
	public String getDetails()
	{
		return day+"/"+month+"/"+year;
	}
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public boolean setDay(int d)
	{
		if(d>30)
		{   System.out.println("date cannot be 30");
			System.exit(0);
			return false;
		}
		else
		{   day=d;
			return true;
		}
	}
	public boolean setMonth(int m)
	{
		if(m>12)
		{	System.out.println("month cannot be 30");
			System.exit(0);
			return false;
		}
		else
		{	month=m;
			return true;
		}
	}
	public boolean setYear(int y)
	{
		if(y>2019 && y<1990)
		{	System.out.println("year cannot be 30");
			System.exit(0);
			return false;
		}
		else
		{	year=y;
			return true;
		}
	}
	
}
