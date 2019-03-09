package com.employee.emp_demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.emp_demo.mappers.EmployeeMapper;
import com.employee.emp_demo.models.Employee;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getAllEmps(){
		return employeeMapper.getAllEmps();
	}
	
	public void insertEmp(Employee emp) {
		employeeMapper.insertEmp(emp);
	}
	
	public void updateEmp(Employee emp) {
		employeeMapper.updateEmp(emp);
	}
	
	public void deleteEmp(Integer empId) {
		employeeMapper.deleteEmp(empId);
	}
	
}
