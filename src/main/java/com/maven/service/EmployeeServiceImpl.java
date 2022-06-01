package com.maven.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.maven.dao.EmployeeDAOImpl;
import com.maven.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	//Map<Integer,Employee> employeeDB = new HashMap();
	EmployeeDAOImpl employeeDAOImpl=new EmployeeDAOImpl();

	@Override
	public Optional<Employee> addEmployee(Employee employee) {
		
		return employeeDAOImpl.addEmployee(employee);
	}

	

	@Override
	public Optional<Employee> getEmployeeById(Employee employee) {
		
		return employeeDAOImpl.getEmployeeById(employee);
	}

	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDAOImpl.getEmployees();
	}



	@Override
	public Optional<Employee> updateemployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAOImpl.updateemployee(employee);
	}

	
}
