package com.Springboot_Hibernate_Mariadb_Sequence.Springboot_Hibernate_Mariadb_Sequence_example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> 
{

}
