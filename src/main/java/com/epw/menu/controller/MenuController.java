package com.epw.menu.controller;

import com.epw.menu.dto.MenuItemDto;
import com.epw.menu.service.MenuService;
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

    @GetMapping("/{roleId}")
    public List<MenuItemDto> getMenu(@PathVariable Long roleId) {
        return menuService.getMenuByRole(roleId);
    }
}