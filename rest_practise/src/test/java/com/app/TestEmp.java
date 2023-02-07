package com.app;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Employee;
import com.app.repository.EmployeeRespository;
import com.app.service.EmployeeService;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

public class TestEmp {
	@Autowired
	private EmployeeRespository empRepo;
	
	@Test
	void test() {
		assertNotNull(empRepo);
	}
	
	@Test
	void addEmp()
	{
		List<Employee> eList=List.of(
				new Employee("nikita", "kadam", "niki@123", "nik", "pune"),
				new Employee("sanket", "jadhav", "sanky@123", "niki", "pune"),
				new Employee("vaish", "ghadge", "vaish@123", "123", "satara"),
				new Employee("pritam", "chavan", "pritam@123", "1236", "pune"));
		empRepo.saveAll(eList);
	}

}
