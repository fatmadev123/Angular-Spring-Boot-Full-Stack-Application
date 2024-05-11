package com.fatma.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatma.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
