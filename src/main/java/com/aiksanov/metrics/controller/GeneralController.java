package com.aiksanov.metrics.controller;

import com.aiksanov.metrics.dto.QualityIndicatorsAmountDTO;
import com.aiksanov.metrics.dto.QualityIndicatorsDTO;
import com.aiksanov.metrics.service.GeneralService;
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

    @Autowired
    public GeneralController(GeneralService generalService) {
        this.generalService = generalService;
    }

    @GetMapping("/qualityIndicators/issues/{projectId}")
    public QualityIndicatorsDTO getQualityIndicators(@PathVariable int projectId) {
        return this.generalService.getQualityIndicators(projectId);
    }

    @GetMapping("/qualityIndicators/amount/{projectId}")
    public QualityIndicatorsAmountDTO getQualityIndicatorsAmount(@PathVariable int projectId) {
        LOGGER.info("GET /qualityIndicators/amount/{}", projectId);
        return this.generalService.getQualityIndicatorsAmount(projectId);
    }
}
