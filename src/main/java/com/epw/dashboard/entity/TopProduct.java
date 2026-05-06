package com.epw.dashboard.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "top_products")
@Data
public class TopProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer total;
}