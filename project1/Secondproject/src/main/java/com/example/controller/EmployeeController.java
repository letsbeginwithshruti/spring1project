package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	 // get all employee
	@GetMapping("/employees")
	public List<Employee> getCAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	// Get an Employee detail by id
	@GetMapping("/employees/{id}")
	public Employee getCAEmployee(@PathVariable int id) {
		return employeeService.getAnEmployee(id);
	}
	// Create an Employee
	@PostMapping("/employees")
	public Employee addAnEmployee(@RequestBody Employee emp) {
		return  employeeService.createEmployee(emp) ;
	}
	// Update an Employee 
	@PutMapping("/employees/{id}")
	public Employee updateCAnEmployee(@PathVariable int id, @RequestBody Employee emp)
	{
		return employeeService.update(emp, id);
	}
	//Delete an existing Employee by id
	@DeleteMapping("/employees/{id}")
	public String deleteCAnEmployee(@PathVariable int id)
	{
		return employeeService.delete(id);
	}
}
