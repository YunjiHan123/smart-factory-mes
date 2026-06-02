package com.smartfactory.mes.simulation.controller;

import com.smartfactory.mes.global.api.ApiResponse;
import com.smartfactory.mes.simulation.dto.dashboard.DashboardResponseModels;
import com.smartfactory.mes.simulation.service.DashboardQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Dashboard", description = "Dashboard and KPI query APIs")
@RequiredArgsConstructor
@RequestMapping("/api/dashboard")
@ConditionalOnProperty(prefix = "spring.datasource", name = "url")
public class DashboardQueryController {

    private final DashboardQueryService dashboardQueryService;

    @Operation(summary = "Get dashboard snapshot", description = "Return KPI, line status, equipment summary, and alarm data for the main dashboard.")
    @GetMapping
    public ApiResponse<DashboardResponseModels.DashboardSnapshotResponse> getDashboardSnapshot() {
        return ApiResponse.success(dashboardQueryService.getDashboardSnapshot());
    }
}
