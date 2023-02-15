package com.example.service;

import java.util.List;

import org.springframework.stereotype.Component;


import com.example.entity.Employee;

@Component
public interface EmployeeService {
	
	Employee createEmployee(Employee emp);
	
	List<Employee> getAllEmployee();
	
	Employee getAnEmployee(int id);
	
	Employee update (Employee emp, int id);
	
	String delete (int id);
}
