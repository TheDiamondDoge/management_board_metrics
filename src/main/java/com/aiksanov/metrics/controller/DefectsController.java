package com.aiksanov.metrics.controller;

import com.aiksanov.metrics.data.NewOpenDefects;
import com.aiksanov.metrics.service.DefectsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/defects")
public class DefectsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BacklogController.class);

    private final DefectsService defectsService;

    @Autowired
    public DefectsController(DefectsService defectsService) {
        this.defectsService = defectsService;
    }

    @GetMapping("/list/{projectId}")
    public List<NewOpenDefects> getQualityList(@PathVariable int projectId) {
        LOGGER.info("GET /defects/list/{}", projectId);
        return this.defectsService.getDefectsKPIWithoutNone(projectId);
    }
}
