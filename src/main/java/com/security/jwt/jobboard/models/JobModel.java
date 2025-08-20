package com.security.jwt.jobboard.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_JOBS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobModel {

    private Long id;

    private String title;

    private String description;

    private String location;

    private Double salary;

    private LocalDateTime publishedAt;

}
