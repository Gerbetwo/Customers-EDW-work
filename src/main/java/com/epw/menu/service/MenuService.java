package com.epw.menu.service;

import com.epw.menu.dto.MenuItemDto;
import com.epw.menu.repository.MenuOptionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {

    private final MenuOptionRepository repository;

    public MenuService(MenuOptionRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<MenuItemDto> getMenuByRole(Long roleId) {
        return repository.findByRoleIdOrderByOrderAsc(roleId)
                .stream()
                .map(opt -> new MenuItemDto(opt.getName(), opt.getContent()))
                .toList();
    }
}