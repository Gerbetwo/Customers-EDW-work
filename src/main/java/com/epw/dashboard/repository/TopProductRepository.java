package com.epw.dashboard.repository;

import com.epw.dashboard.entity.TopProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TopProductRepository extends JpaRepository<TopProduct, Long> {
    List<TopProduct> findAllByOrderByTotalDesc();
}