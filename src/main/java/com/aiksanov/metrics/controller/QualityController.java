package com.aiksanov.metrics.controller;

import com.aiksanov.metrics.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quality")
public class QualityController {
    private QualityService qualityService;

    @Autowired
    public QualityController(QualityService qualityService) {
        this.qualityService = qualityService;
    }

    @GetMapping
    public void getAll() {
        this.qualityService.getAll();
    }
}
