package com.epw.dashboard.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_strategy")
@Data
public class ProductStrategy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer sales;

    @Column(name = "avg_ticket")
    private Integer avgTicket;

    private Integer margin;

    @Column(name = "stock_risk")
    private String stockRisk;
}