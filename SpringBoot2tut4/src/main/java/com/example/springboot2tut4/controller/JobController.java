package com.example.springboot2tut4.controller;


import com.example.springboot2tut4.model.Employee;
import com.example.springboot2tut4.model.Job;
import com.example.springboot2tut4.repository.EmployeeRepository;
import com.example.springboot2tut4.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/job")
public class JobController {
    @Autowired
    JobRepository jobRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @RequestMapping(value = "/list")
    public String getAllJob(Model model) {
        List<Job> jobs = jobRepository.findAll();
        for(int i = 0; i <jobs.size(); i++){
            System.out.println(jobs.get(i).toString());}
        model.addAttribute("jobs", jobs);
        return "jobList";
    }

    @RequestMapping(value = "/{id}")
    public String getJobById(
            @PathVariable(value = "id") Long id, Model model) {
        Job job = jobRepository.getById(id);
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        model.addAttribute("job", job);
        return "jobDetail";
    }

    @RequestMapping(value = "/add")
    public String addJob(Model model) {
        Job job = new Job();
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        model.addAttribute("job", job);
        return "jobAdd";
    }

    @RequestMapping(value = "/update/{id}")
    public String updateJob(
            @PathVariable(value = "id") Long id, Model model) {
        Job job = jobRepository.getById(id);
        model.addAttribute(job);
        return "jobUpdate";
    }

    @RequestMapping(value = "/save")
    public String saveUpdate(
            @RequestParam(value = "id", required = false) Long id, @Valid Job job, BindingResult result) {
        if (result.hasErrors()) {
            if (id == null) {
                return "jobAdd";
            } else {
                return "jobUpdate";
            }
        }
        job.setId(id);
        jobRepository.save(job);
        return "redirect:/list";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteJob(
            @PathVariable(value = "id") Long id) {
        Job job = jobRepository.getById(id);
        jobRepository.delete(job);
        return "redirect:/list";
    }
    @RequestMapping("/search")
    public String searchJob(
            Model model,
            @RequestParam(value = "name") String name){
        List<Job> jobs = jobRepository.findByNameContaining(name);
        model.addAttribute("jobs", jobs);
        return "jobList";
    }
    @RequestMapping("/sort/asc")
    public String sortJobAsc(Model model){
        List<Job> jobs = jobRepository.findAll(Sort.by(Sort.Direction.ASC,"name"));
        model.addAttribute("jobs",jobs);
        return "jobList";
    }

    @RequestMapping("/sort/desc")
    public String sortJobDesc(Model model){
        List<Job> jobs = jobRepository.findAll(Sort.by(Sort.Direction.DESC,"name"));
        model.addAttribute("jobs",jobs);
        return "jobList";
    }
}
