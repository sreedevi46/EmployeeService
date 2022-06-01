package com.maven.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.maven.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	Map<Integer,Employee> employeeDB = new HashMap();

	@Override
	public Optional<Employee> addEmployee(Employee employee) {
		employeeDB.put(employee.getEmpId(), employee);
		return Optional.of(employeeDB.get(employee.getEmpId()));
	}

	@Override
	public Optional<Employee> updateemployee(Employee employee) {
		if(employeeDB.containsKey(employee.getEmpId())) {
			employeeDB.replace(employee.getEmpId(), employee);
			return Optional.of(employee);
		}else {
			return Optional.of(null);
		}
	}

	@Override
	public Optional<Employee> getEmployeeById(Employee employee) {
		return Optional.of(employeeDB.get(employee.getEmpId()));
		
		
	}

	@Override
	public List<Employee> getEmployees() {
		return new ArrayList<Employee>(employeeDB.values());		
	}

	
}
