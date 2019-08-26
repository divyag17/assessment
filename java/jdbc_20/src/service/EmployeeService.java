package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public List<Employee> getEmployeeById(int id);
	public void getMetadata();
}
