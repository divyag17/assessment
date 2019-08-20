package INHERITANCE;

public class employee {
private int empid;
private String fname;
private String lname;
private String dept;
employee()
{
	
}
employee(int empid,String fname,String lname,String dept)
{
	this.empid=empid;
	this.fname=fname;
	this.lname=lname;
	this.dept=dept;
}

protected String getDetails()
{
	return empid+" "+fname+" "+lname+" "+dept;
}

}
