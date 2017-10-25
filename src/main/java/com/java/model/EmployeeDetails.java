package com.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeDetails 
{
	@Id
	@Column(name="employee_id")
	/*	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 */	private int id;
	@Column(name="emp_num")
	private String mobNumber;
	@Column(name="emp_add")
	private String empAddress;
	@Column(name="empl_sal")
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", mobNumber=" + mobNumber + ", empAddress=" + empAddress + ", salary="
				+ salary + "]";
	}
}
