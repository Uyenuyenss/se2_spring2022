package com.example.springboot2tut4.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotEmpty
    @Length(min = 3, max = 30)
    private String name;

    @Min(value = 18, message = "Employee age must be greater than 18")
    @Max(value = 55, message = "Employee age must be smaller than 55")
    private int age;

    @NotEmpty(message = "Image can not be empty")
    @Size(min = 5, max = 1000, message = "Image length is invalid")
    private String image;

    @Length(min = 10, max = 100)
    private String address;

    @ManyToOne
    public Company company;
    @ManyToMany
    public List<Job> job;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Job> getJob() {
        return job;
    }

    public void setJob(List<Job> job) {
        this.job = job;
    }

    public Employee() {
    }

    public Employee(Long id, String name, int age, String image, String address, Company company, List<Job> job) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.image = image;
        this.address = address;
        this.company = company;
        this.job = job;
    }
}