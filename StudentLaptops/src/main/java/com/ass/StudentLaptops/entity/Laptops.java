package com.ass.StudentLaptops.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="laptops_info")
public class Laptops {
	@Id
	private Integer id;
	private String lpname;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLpname() {
		return lpname;
	}
	public void setLpname(String lpname) {
		this.lpname = lpname;
	}
	@Override
	public String toString() {
		return "Laptops [id=" + id + ", lpname=" + lpname + "]";
	}

}
