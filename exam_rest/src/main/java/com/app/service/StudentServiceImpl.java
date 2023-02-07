package com.app.service;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.customException.StudentException;
import com.app.entities.Student;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studRepo;

	@Override
	public List<Student> getAllStudents() {
		System.out.println("in get method of service"+getClass());
		return studRepo.findAll();
	}

	@Override
	public void addStudent(Student newStudent) {
		System.out.println("in service method"+getClass());
		studRepo.save(newStudent);
		
	}

	@Override
	public void updateStudent(Student updateStud) {
		System.out.println("in service of update"+getClass());
		if(studRepo.existsById(updateStud.getId())) {
		studRepo.save(updateStud);
		}
		throw new StudentException("invalid id");
	}

	@Override
	public void removeSt(Long id) {
		System.out.println("in delete method"+getClass());
		studRepo.deleteById(id);
		
	}

	@Override
	public Student fetchbyId(Long id) {
		
		return studRepo.findById(id).orElseThrow(()->new StudentException("invalid id"));
	}
}
