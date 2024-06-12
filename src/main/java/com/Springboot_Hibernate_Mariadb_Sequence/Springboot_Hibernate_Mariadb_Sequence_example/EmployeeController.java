package com.Springboot_Hibernate_Mariadb_Sequence.Springboot_Hibernate_Mariadb_Sequence_example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeRepository erepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return "This is demo test seq";
	}
	
	@RequestMapping("/post")
	public String savedata(@RequestBody Employee employee)
	{
		erepo.save(employee);
		return "Data saved to database";
	}
	
	@RequestMapping("/get")
	public List<Employee> getdata()
	{
		return erepo.findAll();
	}
}
