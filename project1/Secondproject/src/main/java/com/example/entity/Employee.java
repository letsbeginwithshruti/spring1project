package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "employee_details")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eid", length = 10)
	private int id;
	@Column(name = "ename", length = 20)
	private String empname;
	@Column(name = "addr", length = 20)
	private String address;
	@Column(name = "empno", length = 11)
	private long mobno;

	public Employee(int id, String empname, String address, long mobno) {
		super();
		this.id = id;
		this.empname = empname;
		this.address = address;
		this.mobno = mobno;
	}

	public Employee(String empname, String address, long mobno) {
		super();
		this.empname = empname;
		this.address = address;
		this.mobno = mobno;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
}
