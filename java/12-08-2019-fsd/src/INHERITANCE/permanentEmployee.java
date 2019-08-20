package INHERITANCE;

public class permanentEmployee extends employee {
	private int salary;
	
	permanentEmployee()
	{
		
	}
	public permanentEmployee(int salary)
	{   super(1,"rani","divya","cs");
		this.salary=salary;
	}
	@Override
	
		public String getDetails()
		{
			return super.getDetails()+""+salary;
		}
	
}
