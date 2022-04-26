package com.example.springboot2tut4.repository;

import com.example.springboot2tut4.model.Employee;
import com.example.springboot2tut4.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByNameContaining(String name);
}
