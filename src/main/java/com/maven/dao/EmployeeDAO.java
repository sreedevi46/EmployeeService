package com.maven.dao;

import java.util.List;
import java.util.Optional;

import com.maven.dto.Employee;

public interface EmployeeDAO {
	 
	public Optional<Employee> addEmployee(Employee employee);
	
	public Optional<Employee> updateemployee(Employee employee);
	
	public Optional<Employee> getEmployeeById(Employee employee);
	
	public List<Employee> getEmployees();
	
}
