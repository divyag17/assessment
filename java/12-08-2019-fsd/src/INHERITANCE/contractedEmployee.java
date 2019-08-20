package INHERITANCE;

public class contractedEmployee extends employee{
private int rate;
	
	contractedEmployee()
	{
		
	}
	contractedEmployee(int rate)
	{   super(5,"ramya","sai","it");
		this.rate=rate;
	}
	@Override
	
		protected String getDetails()
		{   
			return super.getDetails()+" "+rate;
		}
}
