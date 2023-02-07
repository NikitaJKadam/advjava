package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")
public class Studentontroller {

	@Autowired
	private StudentService studSer;
	
	public Studentontroller() {
		System.out.println("in controller ctor"+getClass());
	}
	
	//getting all students
	@GetMapping("/getall")
	public List<Student> getAllStud(){
		return studSer.getAllStudents();
	}
	//insert student
	@PostMapping
	public void addStudent(@RequestBody Student newStudent)
	{
		studSer.addStudent(newStudent);
	}
	
	//update the student	
	@PutMapping
	public void updateStudent(@RequestBody Student updateStud)
	{
		studSer.updateStudent(updateStud);
	}
	//delete by id
	
	@DeleteMapping("{id}")
	public void removeStudent(@PathVariable Long id)
	{
		studSer.removeSt(id);
	}
	//fetch by id
	@GetMapping("{id}")
	public Student fetchById(@PathVariable Long id)
	{
		return studSer.fetchbyId(id);
	}
}
