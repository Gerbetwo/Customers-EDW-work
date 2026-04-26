package com.epw.menu.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "menu_options")
@Data
public class MenuOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_id", nullable = false)
    private Long roleId;

    @Column(nullable = false)
    private String name;       // identificador interno (ej: "customers")

    @Column(nullable = false)
    private String content;    // texto a mostrar (ej: "Customers")

    @Column(name = "menu_order")
    private Integer order;     // para controlar el orden de aparición
}