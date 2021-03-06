package com.example.resful_api_tut35.controller;

import com.example.resful_api_tut35.entity.Company;
import com.example.resful_api_tut35.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;
    @GetMapping(value = "/")
    public List<Company> viewCompanyList(){
        return companyRepository.findAll();
    }
    @GetMapping (value = "/{id}")
    public Company viewCompanyById(
            @PathVariable(value = "id") Long id
    ) {
        return companyRepository.findById(id).get();
    }
    @PostMapping(value = "/")
    public Company addCompany (
            @RequestBody Company company
    ) {
        return companyRepository.save(company);
    }
    @PutMapping(value = "/{id}")
    public void updateCompany(
            @PathVariable(value = "id") Long id,
            @RequestBody Company company
    ){
        if (companyRepository.existsById(id)){
            company.setId(id);
            companyRepository.save(company);
        }
    }
    @DeleteMapping(value = "/{id}")
    public void deleteCompany(
            @PathVariable(value = "id") Long id
    ){
        if(companyRepository.existsById(id)){
            Company company = companyRepository.getById(id);
            companyRepository.delete(company);
        }
    }
}