package com.example.resful_api_tut35.repository;

import com.example.resful_api_tut35.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
