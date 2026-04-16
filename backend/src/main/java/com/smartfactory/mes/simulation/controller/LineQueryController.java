package com.smartfactory.mes.simulation.controller;

import com.smartfactory.mes.global.api.ApiResponse;
import com.smartfactory.mes.simulation.dto.line.LineResponseModels;
import com.smartfactory.mes.simulation.service.LineQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Line", description = "Production line detail query APIs")
@RequiredArgsConstructor
@RequestMapping("/api/lines")
@ConditionalOnProperty(prefix = "spring.datasource", name = "url")
public class LineQueryController {

    private final LineQueryService lineQueryService;

    @Operation(summary = "Get line detail", description = "Return process layout, equipment states, and metrics for a production line.")
    @GetMapping("/{lineId}")
    public ApiResponse<LineResponseModels.LineDetailResponse> getLineDetail(@PathVariable Long lineId) {
        return ApiResponse.success(lineQueryService.getLineDetail(lineId));
    }
}
