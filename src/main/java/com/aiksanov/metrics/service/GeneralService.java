package com.aiksanov.metrics.service;

import com.aiksanov.metrics.data.Backlog;
import com.aiksanov.metrics.data.NewOpenDefects;
import com.aiksanov.metrics.data.Quality;
import com.aiksanov.metrics.dto.QualityIndicatorsAmountDTO;
import com.aiksanov.metrics.dto.QualityIndicatorsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralService {
    private final BacklogService backlogService;
    private final DefectsService defectsService;
    private final QualityService qualityService;

    @Autowired
    public GeneralService(BacklogService backlogService, DefectsService defectsService, QualityService qualityService) {
        this.backlogService = backlogService;
        this.defectsService = defectsService;
        this.qualityService = qualityService;
    }

    public QualityIndicatorsDTO getQualityIndicators(int projectId) {
        List<Backlog> backlogList = this.backlogService.getBacklogKpiIssues(projectId);
        List<NewOpenDefects> defectsList = this.defectsService.getDefectsKPI(projectId);
        List<Quality> qualityList = this.qualityService.getQualityKPI(projectId);
        return new QualityIndicatorsDTO()
                .setBacklogs(backlogList)
                .setDefects(defectsList)
                .setQualities(qualityList);
    }

    public QualityIndicatorsAmountDTO getQualityIndicatorsAmount(int projectId) {
        List<Backlog> backlogList = this.backlogService.getBacklogKpiIssues(projectId);
        List<NewOpenDefects> defectsList = this.defectsService.getDefectsKPI(projectId);
        List<Quality> qualityList = this.qualityService.getQualityKPI(projectId);
        return new QualityIndicatorsAmountDTO()
                .setBacklog(backlogList.size())
                .setDefects(defectsList.size())
                .setQuality(qualityList.size());
    }
}
