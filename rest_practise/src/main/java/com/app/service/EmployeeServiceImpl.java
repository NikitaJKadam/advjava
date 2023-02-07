package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.customExc.StudenExc;
import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.repository.EmployeeRespository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	private EmployeeRespository emprepo;

	@Override
	public List<Employee> getAllemp() {
		
		return emprepo.findAll();
	}

	@Override
	public void addEmployee(Employee e, Department dept) {
		e.addDept(dept);
		emprepo.save(e);
	}

	@Override
	public void removeEmployee(Long id) {
		
		emprepo.deleteById(id);		
	}

	@Override
	public void updateEmployee(Employee newEmp) {
				
		if(emprepo.existsById(newEmp.getId()))
		{
			emprepo.save(newEmp);
		}
	}

	@Override
	public Employee login(String email, String password) {
		
		return emprepo.findByEmailAndPassword(email,password)
				.orElseThrow(()->new StudenExc("invalid id"));
		
		
	}
}
