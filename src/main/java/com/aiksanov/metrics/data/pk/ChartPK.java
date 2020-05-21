package com.aiksanov.metrics.data.pk;

import com.aiksanov.metrics.util.enums.ChartTypes;

import java.io.Serializable;
import java.util.Objects;

public class ChartPK implements Serializable {
    private ChartTypes metricsType;
    private int projectId;
    private String scope;
    private int week;

    public ChartPK() {
    }

    public ChartPK(ChartTypes metricsType, int projectId, String scope, int week) {
        this.metricsType = metricsType;
        this.projectId = projectId;
        this.scope = scope;
        this.week = week;
    }

    public ChartTypes getMetricsType() {
        return metricsType;
    }

    public void setMetricsType(ChartTypes metricsType) {
        this.metricsType = metricsType;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChartPK chartPK = (ChartPK) o;
        return projectId == chartPK.projectId &&
                week == chartPK.week &&
                metricsType == chartPK.metricsType &&
                Objects.equals(scope, chartPK.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricsType, projectId, scope, week);
    }
}
