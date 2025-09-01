package com.security.jwt.jobboard.dtos.job;

import lombok.Data;

@Data
public class JobRequest {

    private String title;

    private String description;

    private String location;

    private Double salary;
}
