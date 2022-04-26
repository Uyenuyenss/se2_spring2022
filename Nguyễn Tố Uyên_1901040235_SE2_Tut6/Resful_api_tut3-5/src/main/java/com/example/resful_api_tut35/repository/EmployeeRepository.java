package com.example.resful_api_tut35.repository;

import com.example.resful_api_tut35.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
