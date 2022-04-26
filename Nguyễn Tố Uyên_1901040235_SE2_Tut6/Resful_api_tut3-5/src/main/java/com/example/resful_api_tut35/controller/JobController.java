package com.example.resful_api_tut35.controller;

import com.example.resful_api_tut35.entity.Job;
import com.example.resful_api_tut35.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    JobRepository jobRepository;
    @GetMapping(value = "/")
    public List<Job> viewJobList(){
        return jobRepository.findAll();
    }
    @GetMapping (value = "/{id}")
    public Job viewJobById(
            @PathVariable(value = "id") Long id
    ) {
        return jobRepository.findById(id).get();
    }
    @PostMapping(value = "/")
    public Job addJob (
            @RequestBody Job job
    ) {
        return jobRepository.save(job);
    }
    @PutMapping(value = "/{id}")
    public void updateJob(
            @PathVariable(value = "id") Long id,
            @RequestBody Job job
    ){
        if (jobRepository.existsById(id)){
            job.setId(id);
            jobRepository.save(job);
        }
    }
    @DeleteMapping(value = "/{id}")
    public void deleteJob(
            @PathVariable(value = "id") Long id
    ){
        if(jobRepository.existsById(id)){
            Job company = jobRepository.getById(id);
            jobRepository.delete(company);
        }
    }
}
