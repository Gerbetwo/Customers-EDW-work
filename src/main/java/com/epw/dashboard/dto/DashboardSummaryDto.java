package com.epw.dashboard.dto;

import java.util.List;

public record DashboardSummaryDto(
    Integer completed,
    Integer pending,
    Integer cancelled,
    List<MonthlySaleDto> monthlySales,
    List<TopProductDto> topProducts,
    List<ProductStrategyItemDto> productStrategy
) {
    public record MonthlySaleDto(
        String month,
        Integer total
    ) {}

    public record TopProductDto(
        String name,
        Integer total
    ) {}

    public record ProductStrategyItemDto(
        String name,
        Integer sales,
        Integer avgTicket,
        Integer margin,
        String stockRisk
    ) {}
}