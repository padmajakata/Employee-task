package com.example.demo.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name="PEmployee")
public class Employee {

	@Id
	private long id;
	private String name;
	private String age;
	private String dob;
	private long phno;
//	@OneToMany(targetEntity= "DepartmentEntity.class,cascade=CascadeType.ALL")
//	 @JoinColumn(name=emp_fk,referencedColumnName="id")
	private List<DepartmentEntity> department;
	public Employee(long i, String name, String age, String dob, long phno) {
		super();
		this.id = i;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.phno = phno;
	}
	public Employee() {
		super();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", phno=" + phno + "]";
	}
	
}
