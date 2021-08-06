package com.javatechie.jpastreamer.repository;

import com.javatechie.jpastreamer.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
