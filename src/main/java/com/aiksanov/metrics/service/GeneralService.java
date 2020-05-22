package com.aiksanov.metrics.service;

import com.aiksanov.metrics.data.Backlog;
import com.aiksanov.metrics.data.NewOpenDefects;
import com.aiksanov.metrics.data.Quality;
import com.aiksanov.metrics.data.QualityIndicatorsInfo;
import com.aiksanov.metrics.data.repository.QualityIndicatorsInfoRepo;
import com.aiksanov.metrics.dto.QualityIndicatorsAmountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralService {
    private final BacklogService backlogService;
    private final DefectsService defectsService;
    private final QualityService qualityService;
    private final QualityIndicatorsInfoRepo indicatorsInfoRepo;

    @Autowired
    public GeneralService(BacklogService backlogService, DefectsService defectsService, QualityService qualityService,
                          QualityIndicatorsInfoRepo indicatorsInfoRepo)
    {
        this.backlogService = backlogService;
        this.defectsService = defectsService;
        this.qualityService = qualityService;
        this.indicatorsInfoRepo = indicatorsInfoRepo;
    }

    public QualityIndicatorsAmountDTO getQualityIndicatorsAmount(int projectId) {
        List<Backlog> backlogList = this.backlogService.getBacklogKpiIssuesWithoutNone(projectId);
        List<NewOpenDefects> defectsList = this.defectsService.getDefectsKPIWithoutNone(projectId);
        List<Quality> qualityList = this.qualityService.getQualityKPI(projectId);
        QualityIndicatorsInfo updateInfo = this.indicatorsInfoRepo.findById(projectId)
                .orElseGet(QualityIndicatorsInfo::new);
        return new QualityIndicatorsAmountDTO()
                .setBacklog(backlogList.size())
                .setDefects(defectsList.size())
                .setQuality(qualityList.size())
                .setUpdatedOn(updateInfo.getUpdatedOn())
                .setUpdateInProcess(updateInfo.isUpdateInProcess());
    }
}
