package com.aiksanov.metrics.service;

import com.aiksanov.metrics.data.NewOpenDefects;
import com.aiksanov.metrics.data.Quality;
import com.aiksanov.metrics.data.repository.DefectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefectsService {
    private DefectsRepository defectsRepository;

    @Autowired
    public DefectsService(DefectsRepository defectsRepository) {
        this.defectsRepository = defectsRepository;
    }

    public void getAll() {
        Iterable<NewOpenDefects> defects = this.defectsRepository.findAll();
        defects.forEach(System.out::println);
    }

    public List<NewOpenDefects> getDefectsKPI(int projectId) {
        return this.defectsRepository.getDefectsKpiIssues(projectId).orElseGet(ArrayList::new);
    }
}
