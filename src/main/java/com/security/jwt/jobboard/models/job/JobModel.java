package com.security.jwt.jobboard.models.job;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String location;

    private Double salary;

    private LocalDateTime publishedAt;

}
