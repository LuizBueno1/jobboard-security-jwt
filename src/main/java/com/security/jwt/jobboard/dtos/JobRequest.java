package com.security.jwt.jobboard.dtos;

import lombok.Data;

@Data
public class JobRequest {

    private String title;

    private String description;

    private String location;

    private Double salary;
}
