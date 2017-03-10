package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{

 public long count() ;
 public List<Employee> findAll() ;
 public void delete(int id);
 public Employee findOne(Integer id);
 public <S extends Employee> List<S> save(Iterable<S> employee) ;
 //@Query("from Employee where departmentID=depId")
 //public List<Employee>getEmployeeByDepId(int depId);
 public List<Employee>findBydepartmentID(int id);
 @Modifying
 @Query("delete from Employee e where e.departmentID=?1")
 public void deleteEmployeeBydepId(int depId);
 
}
