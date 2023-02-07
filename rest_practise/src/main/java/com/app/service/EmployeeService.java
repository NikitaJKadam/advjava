package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entities.Department;
import com.app.entities.Employee;

public interface EmployeeService {

	List<Employee> getAllemp();

	void addEmployee(Employee e, Department dept);

	void removeEmployee(Long id);

	void updateEmployee(Employee newEmp);

	Employee login(String email, String password);

}
