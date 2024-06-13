package com.ass.StudentLaptops.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Student {
	
	@Id
	private Integer id;
	private String name;
	private String email;
	@OneToMany
	private List<Laptops> laptop;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Laptops> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptops> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", laptop=" + laptop + "]";
	}
	

}
