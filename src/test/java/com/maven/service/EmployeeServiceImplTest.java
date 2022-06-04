package com.maven.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Test;

import com.maven.dao.EmployeeDAOImpl;
import com.maven.dto.Employee;

public class EmployeeServiceImplTest {
	
	EmployeeDAOImpl employeeDAOImpl =new EmployeeDAOImpl();
	Employee employee=new Employee(101,"sri",10000.0,"JAVA");

	@Test
	public void testCreateEmployee() {
		
    Optional<Employee> addedEmployee=employeeDAOImpl.addEmployee(employee);
    assertTrue(addedEmployee.isPresent());
    assertNotNull(addedEmployee.get());
	}

	@Test
	public void testGetEmployeeById() {
	employeeDAOImpl.addEmployee(employee);
		  Optional<Employee> employee=employeeDAOImpl.getEmployeeById(101);
		  assertTrue(employee.isPresent());
		  assertNotNull(employee.get());
	}
	
	@Test
	public void testUpdateEmployee() {
	employeeDAOImpl.addEmployee(employee);
    Optional<Employee> updatedEmployee=employeeDAOImpl.updateemployee(employee);
    assertTrue(updatedEmployee.isPresent());
	assertNotNull(updatedEmployee.get());
}
	
	//
	@Test
	     public void testGetAllEmployees() {
		 employeeDAOImpl.addEmployee(employee);
		  List<Employee> employees=employeeDAOImpl.getEmployees();
		  assertNotNull(employees);
	}

}
