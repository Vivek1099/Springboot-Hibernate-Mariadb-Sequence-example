package com.Springboot_Hibernate_Mariadb_Sequence.Springboot_Hibernate_Mariadb_Sequence_example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity(name="empinfo")
public class Employee 
{
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Employee_generator")
		@SequenceGenerator(name="Employee_sequence",initialValue=12345,allocationSize=1,sequenceName="employee_seq")
		int empid;
		String empName;
		String empCity;
		int empAge;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpCity() {
			return empCity;
		}
		public void setEmpCity(String empCity) {
			this.empCity = empCity;
		}
		public int getEmpAge() {
			return empAge;
		}
		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}
		
}
