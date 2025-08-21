package com.security.jwt.jobboard.controllers;

import com.security.jwt.jobboard.dtos.JobRequest;
import com.security.jwt.jobboard.dtos.JobResponse;
import com.security.jwt.jobboard.models.JobModel;
import com.security.jwt.jobboard.repositories.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/jobs")
@RequiredArgsConstructor
public class JobController {

    private final JobRepository jobRepository;

    @PostMapping
    public ResponseEntity<JobResponse> create(@RequestBody JobRequest request){
        JobModel job = JobModel.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .location(request.getLocation())
                .salary(request.getSalary())
                .publishedAt(LocalDateTime.now())
                .build();

        JobModel saved = jobRepository.save(job);

        JobResponse response = JobResponse.builder()
                .id(saved.getId())
                .title(saved.getTitle())
                .description(saved.getDescription())
                .location(saved.getLocation())
                .publishedAt(saved.getPublishedAt())
                .build();

        return ResponseEntity.ok(response);

    }

    @GetMapping
    public ResponseEntity<List<JobResponse>> findAll(){
        List<JobResponse> jobs = jobRepository.findAll()
                .stream()
                .map(j -> JobResponse.builder()
                        .id(j.getId())
                        .title(j.getTitle())
                        .description(j.getDescription())
                        .location(j.getLocation())
                        .salary(j.getSalary())
                        .publishedAt(j.getPublishedAt())
                        .build())
                .toList();

        return ResponseEntity.ok(jobs);
    }

}
