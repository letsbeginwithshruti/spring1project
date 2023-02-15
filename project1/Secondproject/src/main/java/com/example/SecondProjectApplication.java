package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
public class SecondProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecondProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.save(new Employee("Shruti", "wb", 12345L));
		employeeRepository.save(new Employee("Shifa", "chennai", 22345L));
		employeeRepository.save(new Employee("Nisha", "delhi", 12395L));
        employeeRepository.save(new Employee("Shibu", "wb", 12346L));
		employeeRepository.save(new Employee("Priya", "wb", 12345L));
		System.out.println("----------------All are Saved---------------");

	}
}
