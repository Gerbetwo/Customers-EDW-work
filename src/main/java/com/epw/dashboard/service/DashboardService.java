package com.epw.dashboard.service;

import com.epw.dashboard.dto.DashboardSummaryDto;
import com.epw.dashboard.entity.DashboardStats;
import com.epw.dashboard.repository.DashboardStatsRepository;
import com.epw.dashboard.repository.MonthlySaleRepository;
import com.epw.dashboard.repository.ProductStrategyRepository;
import com.epw.dashboard.repository.TopProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DashboardService {

    private final DashboardStatsRepository statsRepository;
    private final MonthlySaleRepository monthlySaleRepository;
    private final TopProductRepository topProductRepository;
    private final ProductStrategyRepository productStrategyRepository;

    public DashboardService(
        DashboardStatsRepository statsRepository,
        MonthlySaleRepository monthlySaleRepository,
        TopProductRepository topProductRepository,
        ProductStrategyRepository productStrategyRepository
    ) {
        this.statsRepository = statsRepository;
        this.monthlySaleRepository = monthlySaleRepository;
        this.topProductRepository = topProductRepository;
        this.productStrategyRepository = productStrategyRepository;
    }

    @Transactional(readOnly = true)
    public DashboardSummaryDto getSummary() {
        DashboardStats stats = statsRepository.findById(1L)
            .orElseThrow(() -> new RuntimeException("Dashboard stats not found"));

        var monthlySales = monthlySaleRepository.findAllByOrderBySortOrderAsc()
            .stream()
            .map(item -> new DashboardSummaryDto.MonthlySaleDto(
                item.getMonth(),
                item.getTotal()
            ))
            .toList();

        var topProducts = topProductRepository.findAllByOrderByTotalDesc()
            .stream()
            .map(item -> new DashboardSummaryDto.TopProductDto(
                item.getName(),
                item.getTotal()
            ))
            .toList();

        var productStrategy = productStrategyRepository.findAllByOrderBySalesDesc()
            .stream()
            .map(item -> new DashboardSummaryDto.ProductStrategyItemDto(
                item.getName(),
                item.getSales(),
                item.getAvgTicket(),
                item.getMargin(),
                item.getStockRisk()
            ))
            .toList();

        return new DashboardSummaryDto(
            stats.getCompleted(),
            stats.getPending(),
            stats.getCancelled(),
            monthlySales,
            topProducts,
            productStrategy
        );
    }
}