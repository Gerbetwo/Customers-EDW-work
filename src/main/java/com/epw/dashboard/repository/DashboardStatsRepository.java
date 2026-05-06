package com.epw.dashboard.repository;

import com.epw.dashboard.entity.DashboardStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardStatsRepository extends JpaRepository<DashboardStats, Long> {
}