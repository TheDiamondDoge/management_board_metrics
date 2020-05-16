package com.aiksanov.metrics.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pfm_quality_indicators_info")
public class QualityIndicatorsInfo {
    @Id
    private int projectId;
    private Date updatedOn;
    private boolean updateInProcess;

    public QualityIndicatorsInfo() {
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public boolean isUpdateInProcess() {
        return updateInProcess;
    }

    public void setUpdateInProcess(boolean updateInProcess) {
        this.updateInProcess = updateInProcess;
    }
}