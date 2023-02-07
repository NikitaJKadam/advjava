package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {

	Optional<Employee>  findByEmailAndPassword(String email, String password);

}
