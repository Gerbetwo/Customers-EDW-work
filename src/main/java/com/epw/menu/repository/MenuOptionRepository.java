package com.epw.menu.repository;

import com.epw.menu.entity.MenuOption;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MenuOptionRepository extends JpaRepository<MenuOption, Long> {
    List<MenuOption> findByRoleIdOrderByOrderAsc(Long roleId);
}