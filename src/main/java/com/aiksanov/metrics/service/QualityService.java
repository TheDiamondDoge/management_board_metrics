package com.aiksanov.metrics.service;

import com.aiksanov.metrics.data.Quality;
import com.aiksanov.metrics.data.repository.QualityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QualityService {
    private final QualityRepository qualityRepository;

    @Autowired
    public QualityService(QualityRepository qualityRepository) {
        this.qualityRepository = qualityRepository;
    }

    public void getAll() {
        Iterable<Quality> qualities = this.qualityRepository.findAll();
        qualities.forEach(System.out::println);
    }

    public List<Quality> getQualityKPI(int projectId) {
        return this.qualityRepository.getQualityKpiIssues(projectId).orElseGet(ArrayList::new);
    }
}
