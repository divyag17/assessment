package dao;

import java.util.List;

import model.Employee;



public interface EmployeeDao {
	
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public List<Employee> getEmployeeById(int id);
	public void getConnectionInfo();

}
