package com.employee.emp_demo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.employee.emp_demo.models.Employee;

@Mapper
public interface EmployeeMapper {

	public List<Employee> getAllEmps();
	
	public void insertEmp(@Param("emp") Employee emp);
	
	public void updateEmp(@Param("emp") Employee emp);
	
	public void deleteEmp(@Param("empId") Integer empId);
}
