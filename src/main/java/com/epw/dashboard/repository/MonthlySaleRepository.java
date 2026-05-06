package com.epw.dashboard.repository;

import com.epw.dashboard.entity.MonthlySale;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MonthlySaleRepository extends JpaRepository<MonthlySale, Long> {
    List<MonthlySale> findAllByOrderBySortOrderAsc();
}