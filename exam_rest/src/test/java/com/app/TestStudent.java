package com.app;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToDateConverter;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Course;
import com.app.entities.Student;
import com.app.repository.StudentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class TestStudent {
	
	@Autowired
	private StudentRepository studRepo;
	
	@Test
	void test() {
		assertNotNull(studRepo);
	}
	@Test
	void addStudent() {
		List<Student> sList=List.of
				( new Student("nikita", "kadam", "niki@123", LocalDate.of(2023, 02, 01), Course.DAC),
				 new Student("sanket", "jadhav", "sanky@123", LocalDate.of(2022, 02, 01), Course.DAC)
				);
		studRepo.saveAll(sList);
	
	}

}
