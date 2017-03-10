package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeService {
	 public List<Employee> getAllEmployee() ;
	 public Employee addEmployee(Employee employee);
	 
	 public Employee getEmployee(int id);
	 public Employee updateEmployee(Employee employee);
	 public void deleteEmployee(int id);
	 public List<Employee>getEmployeeByDepId(int depId);
	 public void deleteEmployeeBydepId(int depId);

}
