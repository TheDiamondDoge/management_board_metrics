package com.aiksanov.metrics.controller;

import com.aiksanov.metrics.dto.ChartDTO;
import com.aiksanov.metrics.dto.QualityIndicatorsAmountDTO;
import com.aiksanov.metrics.dto.QualityIndicatorsDTO;
import com.aiksanov.metrics.service.ChartService;
import com.aiksanov.metrics.service.GeneralService;
import com.aiksanov.metrics.util.enums.ChartTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general")
public class GeneralController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralController.class);
    private final GeneralService generalService;
    private final ChartService chartService;

    @Autowired
    public GeneralController(GeneralService generalService, ChartService chartService) {
        this.generalService = generalService;
        this.chartService = chartService;
    }

    @GetMapping("/qualityIndicators/amount/{projectId}")
    public QualityIndicatorsAmountDTO getQualityIndicatorsAmount(@PathVariable int projectId) {
        LOGGER.info("GET /qualityIndicators/amount/{}", projectId);
        return this.generalService.getQualityIndicatorsAmount(projectId);
    }

    @GetMapping("/chart/{chartType}/{projectId}")
    public ChartDTO getChartData(@PathVariable String chartType, @PathVariable int projectId) {
        LOGGER.info("GET /chart/{}/{}", chartType, projectId);
        ChartTypes type = ChartTypes.valueOf(chartType.toUpperCase());
        return this.chartService.getChartDto(projectId, type);
    }
}
