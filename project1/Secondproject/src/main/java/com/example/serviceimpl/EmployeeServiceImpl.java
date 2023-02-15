package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee( Employee emp) {
	return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getAnEmployee(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee update(Employee emp, int id) {
		Employee emp1 = employeeRepository.findById(id).get();
		emp1.setAddress(emp.getAddress());
		emp1.setMobno(emp.getMobno());
		return employeeRepository.save(emp1);
	}

	@Override
	public String delete(int id) {
		employeeRepository.deleteById(id);
		return "The Student with id: " +id + " has been deleted!!!";
	}

}
