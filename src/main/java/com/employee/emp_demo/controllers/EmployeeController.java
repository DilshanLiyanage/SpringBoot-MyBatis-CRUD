package com.employee.emp_demo.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.emp_demo.models.Employee;
import com.employee.emp_demo.services.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public String index() {
		return "emps home";
	}
	
	@GetMapping("/emp/all")
	public ResponseEntity<List<Employee>> getAllEmps(){
		return ResponseEntity.ok().body(employeeService.getAllEmps());
	}
	
	@PostMapping("emp/add")
	public ResponseEntity<List<Employee>> insertEmp(@RequestBody Employee emp){
		employeeService.insertEmp(emp);
		return ResponseEntity.ok().body(employeeService.getAllEmps());
	}
	
	@PutMapping("emp/update")
	public ResponseEntity<List<Employee>> updateEmp(@RequestBody Employee emp){
		employeeService.updateEmp(emp);
		return ResponseEntity.ok().body(employeeService.getAllEmps());
	}
	
	@DeleteMapping("emp/delete/{empId}")
	public ResponseEntity<List<Employee>> deleteEmp(@PathVariable Integer empId){
		employeeService.deleteEmp(empId);
		return ResponseEntity.ok().body(employeeService.getAllEmps());
	}
	

}
