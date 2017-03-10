package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.entity.Department;
import com.entity.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@Autowired
	RestTemplate restTemplate;
	String serviceName="DepartmentMicroService";
	String serviceUrl="http://" + serviceName;
	
	@RequestMapping(method= RequestMethod.GET)
	public List<Employee> getEmployees(){
		List<Employee> emplist=employeeService.getAllEmployee();
		return emplist;
		
	}
	@RequestMapping(method=RequestMethod.POST)
	public Employee addEmployee(Employee employee){
		
		
		//Department department=restTemplate.getForObject(serviceUrl+"/department/{depId}",Department.class,employee.getDepartmentID());
		//if(department!=null){
		return employeeService.addEmployee(employee);
		//}
		
		//return null;
				
		
	}
	@RequestMapping(method=RequestMethod.GET, value="/{empId}")
	public Employee getEmployeeById(@PathVariable("empId")int id){
		return employeeService.getEmployee(id);
		
	}
	/*@RequestMapping(method=RequestMethod.GET, value="dept/{departmentID}")
	public List<Employee>getEmployeeByDepId(@PathVariable("departmentID")int id){
		return employeeService.getEmployeeByDepId(id);
	}*/
	@RequestMapping(method=RequestMethod.PUT)
	public Employee updateEmployee(Employee employee){
		return employeeService.updateEmployee(employee);
		
	}
	@RequestMapping(method=RequestMethod.DELETE)
	public void deleteEmployee(int id){
		 employeeService.deleteEmployee(id);
		
	}
	/*@RequestMapping(method=RequestMethod.DELETE,value="/{departmentID}")
	public void deleteEmployeeBydepId(@PathVariable("departmentID") int depId){
		employeeService.deleteEmployeeBydepId(depId);
	}*/
	

}
