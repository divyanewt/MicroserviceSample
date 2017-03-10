package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column
	private int empId;
	private String empName;
	@Column
	private String empAddress;
	@Column
	private int salary;
	@Column
	private int departmentID;
	public Employee(){}
	public Employee(int empId, String empName, String empAddress, int salary, int departmentID) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.salary = salary;
		this.departmentID = departmentID;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", salary=" + salary
				+ ", departmentID=" + departmentID + "]";
	}
	
	

}
