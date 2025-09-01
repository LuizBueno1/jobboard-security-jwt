package com.security.jwt.jobboard.dtos.job;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class JobResponse {

    private Long id;

    private String title;

    private String description;

    private String location;

    private Double salary;

    private LocalDateTime publishedAt;
}
