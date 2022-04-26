package com.example.resful_api_tut35.repository;

import com.example.resful_api_tut35.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
