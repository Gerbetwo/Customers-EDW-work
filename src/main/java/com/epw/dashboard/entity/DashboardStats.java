package com.epw.dashboard.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dashboard_stats")
@Data
public class DashboardStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer completed;

    private Integer pending;

    private Integer cancelled;
}