package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/emps")
public class EmployeeController {

	@Autowired
	private EmployeeService empSer;
	
	public EmployeeController() {
		System.out.println("in emp controller");
	}	
	
	@GetMapping("/getall")
	public List<Employee> getAllEmps()
	{
		return empSer.getAllemp();
	}
	
	@PostMapping("/addemp")
	public void addEmp(Employee e,Department dept )
	{
		empSer.addEmployee(e,dept);
	}
	
	@DeleteMapping("/delete/{id}")
	public void  removeEmp(@PathVariable Long id)
	{
		empSer.removeEmployee(id);
	}
	
	@PutMapping
	public void updateEmp(@RequestBody Employee newEmp)
	{
		empSer.updateEmployee(newEmp);
	}
	
	@PostMapping("/signin/{email}/{password}")
	public Employee signIn(@PathVariable String email,@PathVariable String password)
	{
		return empSer.login(email,password);
	}
	
	
}
