package com.epw.menu.controller;

import com.epw.menu.dto.MenuItemDto;
import com.epw.menu.service.MenuService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "http://localhost:5173")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<MenuItemDto> getMenuForCurrentUser(Authentication auth) {
        // Extraemos el rol del contexto de seguridad
        String role = auth.getAuthorities().iterator().next().getAuthority();
        // El role almacenado es "ROLE_1", "ROLE_2", etc. 
        // En data.sql guardamos role_id numérico; aquí asumimos que los roles coinciden:
        // "ROLE_1" -> id=1L, "ROLE_2" -> id=2L.
        Long roleId = extractRoleId(role);
        return menuService.getMenuByRole(roleId);
    }

    private Long extractRoleId(String role) {
        // Simple: si el formato es ROLE_N, extraemos N
        return Long.parseLong(role.replace("ROLE_", ""));
    }
}