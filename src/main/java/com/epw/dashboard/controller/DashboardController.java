package com.epw.dashboard.controller;

import com.epw.dashboard.dto.DashboardSummaryDto;
import com.epw.dashboard.service.DashboardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "http://localhost:5173")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping
    public DashboardSummaryDto getSummary() {
        return dashboardService.getSummary();
    }
}