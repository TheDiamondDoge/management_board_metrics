package com.aiksanov.metrics.controller;

import com.aiksanov.metrics.data.Quality;
import com.aiksanov.metrics.service.QualityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quality")
public class QualityController {
    private static final Logger LOGGER = LoggerFactory.getLogger(QualityController.class);
    private final QualityService qualityService;

    @Autowired
    public QualityController(QualityService qualityService) {
        this.qualityService = qualityService;
    }

    @GetMapping("/list/{projectId}")
    public List<Quality> getQualityList(@PathVariable int projectId) {
        LOGGER.info("GET /list/{}", projectId);
        return this.qualityService.getQualityKPI(projectId);
    }
}
