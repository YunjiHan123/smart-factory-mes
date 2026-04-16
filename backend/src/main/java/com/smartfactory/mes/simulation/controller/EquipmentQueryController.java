package com.smartfactory.mes.simulation.controller;

import com.smartfactory.mes.global.api.ApiResponse;
import com.smartfactory.mes.simulation.dto.equipment.EquipmentResponseModels;
import com.smartfactory.mes.simulation.service.EquipmentQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Equipment", description = "Equipment detail query APIs")
@RequiredArgsConstructor
@RequestMapping("/api/equipments")
@ConditionalOnProperty(prefix = "spring.datasource", name = "url")
public class EquipmentQueryController {

    private final EquipmentQueryService equipmentQueryService;

    @Operation(summary = "Get equipment detail", description = "Return the current status and production history for a single equipment.")
    @GetMapping("/{equipmentId}")
    public ApiResponse<EquipmentResponseModels.EquipmentDetailResponse> getEquipmentDetail(
            @PathVariable Long equipmentId
    ) {
        return ApiResponse.success(equipmentQueryService.getEquipmentDetail(equipmentId));
    }
}
