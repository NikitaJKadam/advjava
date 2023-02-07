package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student extends BaseEntity{

	@Column(length=30)
	private String firstName;
	
	@Column(length=30)
	private String lastName;
	
	@Column(length=30,unique = true)
	private String email;	
	
	private LocalDate admisionDate;
	
	@Enumerated(EnumType.STRING)
	private Course course;
	public Student() {
		// TODO Auto-generated constructor stub
	}	

	public Student(String firstName, String lastName, String email, LocalDate admisionDate, Course course) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.admisionDate = admisionDate;
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getAdmisionDate() {
		return admisionDate;
	}

	public void setAdmisionDate(LocalDate admisionDate) {
		this.admisionDate = admisionDate;
	}

	@Override
	public String toString() {
		return "Student id"+getId()+"[firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", admisionDate="
				+ admisionDate + "]";
	}
	
}
