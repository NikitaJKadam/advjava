package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emps")
public class Employee extends BaseEntity{

	@Column(length=30)
	private String firstName;
	
	@Column(length=30)
	private String lastName;
	
	@Column(length=30,unique = true)
	private String email;
	
	@Column(length=30,nullable = false)
	private String password;
	
	@Column(length = 30)
	private String city;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="deptId")
	private Department dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	public void addDept(Department dept)
	{
		this.setDept(dept);
	}

	public Employee(String firstName, String lastName, String email, String password, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee id"+getId()+"[firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", city=" + city + "]";
	}
	
	
	
	
	
}
