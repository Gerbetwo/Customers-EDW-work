package com.epw.dashboard.repository;

import com.epw.dashboard.entity.ProductStrategy;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductStrategyRepository extends JpaRepository<ProductStrategy, Long> {
    List<ProductStrategy> findAllByOrderBySalesDesc();
}