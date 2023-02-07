package com.app.service;

import java.util.List;

import com.app.entities.Student;

public interface StudentService {

	List<Student> getAllStudents();

	void addStudent(Student newStudent);

	void updateStudent(Student updateStud);

	void removeSt(Long id);

	Student fetchbyId(Long id);

}
