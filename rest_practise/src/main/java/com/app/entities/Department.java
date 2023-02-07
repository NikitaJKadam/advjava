package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Department extends BaseEntity {

	@Column(length = 30)
	private String dName;

	@Column(length = 30)
	private String location;

	public Department() {

	}
	public Department(String dName, String location) {
		super();
		this.dName = dName;
		this.location = location;
	}


	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	@Override
	public String toString() {
		return "Department id" + getId() + " [dName=" + dName + ", location=" + location + "]";
	}

}
