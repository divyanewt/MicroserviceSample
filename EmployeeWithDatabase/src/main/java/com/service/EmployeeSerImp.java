package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.entity.Employee;

@Service
public class EmployeeSerImp implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(id);
	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepository.delete(id);
		
	}

	public List<Employee> getEmployeeByDepId(int depId) {
		return employeeRepository.findBydepartmentID(depId);
	}
	@Transactional
	public void deleteEmployeeBydepId(int depId) {
		employeeRepository.deleteEmployeeBydepId(depId);
	}
	

}
