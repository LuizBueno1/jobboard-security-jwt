package com.security.jwt.jobboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.jwt.jobboard.models.job.JobModel;

public interface JobRepository extends JpaRepository<JobModel, Long> {
}
