package com.aiksanov.metrics.service;

import com.aiksanov.metrics.data.NewOpenDefects;
import com.aiksanov.metrics.data.repository.DefectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefectsService {
    private final DefectsRepository defectsRepository;

    @Autowired
    public DefectsService(DefectsRepository defectsRepository) {
        this.defectsRepository = defectsRepository;
    }

    public List<NewOpenDefects> getDefectsKPIWithoutNone(int projectId) {
        return this.defectsRepository.getDefectsKpiIssues(projectId).orElseGet(ArrayList::new);
    }

    public List<NewOpenDefects> getDefectsKpiAll(int projectId) {
        return this.defectsRepository.findByProjectId(projectId).orElseGet(ArrayList::new);
    }
}
