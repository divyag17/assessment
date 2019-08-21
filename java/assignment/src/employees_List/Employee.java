package employees_List;

import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparable<Object>{
private int id,age,salary;
private String name,department;
private Date DateOfJoining;
public Employee(int id, int age, int salary, String name, String department, Date dateOfJoining) {
	super();
	this.id=id;
	this.age = age;
	this.salary = salary;
	this.name = name;
	this.department = department;
	DateOfJoining = dateOfJoining;
}
public int getsalary()
{
	return salary;
}
public int getage()
{
	return age;
}
public Date getdate()
{
	return DateOfJoining;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + ", department="
			+ department + ", DateOfJoining=" + DateOfJoining + "]";
}

@Override
public int compareTo(Object o1) {
	// TODO Auto-generated method stub
	Employee emp=(Employee)o1;
	if(this.getsalary()>emp.getsalary())
	{
		return 1;
	}
	else if(this.getsalary()==emp.getsalary())
	{
		return 0;
	}
	else
	{
		return -1;
	}
}

}
