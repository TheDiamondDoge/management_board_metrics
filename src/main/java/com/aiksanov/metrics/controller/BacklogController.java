package com.aiksanov.metrics.controller;

import com.aiksanov.metrics.data.Backlog;
import com.aiksanov.metrics.service.BacklogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/backlog")
public class BacklogController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BacklogController.class);

    private final BacklogService backlogService;

    @Autowired
    public BacklogController(BacklogService backlogService) {
        this.backlogService = backlogService;
    }

    @GetMapping("/list/{projectId}")
    public List<Backlog> getQualityList(@PathVariable int projectId) {
        LOGGER.info("GET /backlog/list/{}", projectId);
        return this.backlogService.getBacklogKpiIssuesAll(projectId);
    }
}
