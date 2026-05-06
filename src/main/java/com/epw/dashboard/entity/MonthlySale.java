package com.epw.dashboard.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "monthly_sales")
@Data
public class MonthlySale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "month_name", nullable = false)
    private String month;

    @Column(nullable = false)
    private Integer total;

    @Column(name = "sort_order")
    private Integer sortOrder;
}