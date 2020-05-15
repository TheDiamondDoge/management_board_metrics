package com.aiksanov.metrics.controller;

import com.aiksanov.metrics.service.DefectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/defects")
public class DefectsController {
    private DefectsService defectsService;

    @Autowired
    public DefectsController(DefectsService defectsService) {
        this.defectsService = defectsService;
    }

    @GetMapping
    public void getAll() {
        this.defectsService.getAll();
    }
}
