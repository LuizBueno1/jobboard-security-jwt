package com.security.jwt.jobboard.repositories;

import com.security.jwt.jobboard.models.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobModel, Long> {
}
