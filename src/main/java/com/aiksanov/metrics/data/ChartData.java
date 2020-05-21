package com.aiksanov.metrics.data;

import com.aiksanov.metrics.data.pk.ChartPK;
import com.aiksanov.metrics.util.enums.ChartTypes;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pfm_backlog_defects_chart_data")
@IdClass(ChartPK.class)
public class ChartData {
    @Id
    @Enumerated(EnumType.STRING)
    private ChartTypes metricsType;

    @Id
    private int projectId;

    @Id
    private String scope;

    @Id
    private int week;
    private int cumulOut;
    private int backlog;
    private int cumulIn;
    private int bl1;
    private int bl2;
    private int bl3;
    private int bl4;
    private int bl5;
    private int in1;
    private int out1;
    private int baseline_backlog;
    private int baseline_cumul_in;
    private int eac_backlog;
    private int eac_cumul_in;
    private Date updated_on;

    public ChartData() {
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

    public int getCumulOut() {
        return cumulOut;
    }

    public void setCumulOut(int cumulOut) {
        this.cumulOut = cumulOut;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public int getCumulIn() {
        return cumulIn;
    }

    public void setCumulIn(int cumulIn) {
        this.cumulIn = cumulIn;
    }

    public int getBl1() {
        return bl1;
    }

    public void setBl1(int bl1) {
        this.bl1 = bl1;
    }

    public int getBl2() {
        return bl2;
    }

    public void setBl2(int bl2) {
        this.bl2 = bl2;
    }

    public int getBl3() {
        return bl3;
    }

    public void setBl3(int bl3) {
        this.bl3 = bl3;
    }

    public int getBl4() {
        return bl4;
    }

    public void setBl4(int bl4) {
        this.bl4 = bl4;
    }

    public int getBl5() {
        return bl5;
    }

    public void setBl5(int bl5) {
        this.bl5 = bl5;
    }

    public int getIn1() {
        return in1;
    }

    public void setIn1(int in1) {
        this.in1 = in1;
    }

    public int getOut1() {
        return out1;
    }

    public void setOut1(int out1) {
        this.out1 = out1;
    }

    public int getBaseline_backlog() {
        return baseline_backlog;
    }

    public void setBaseline_backlog(int baseline_backlog) {
        this.baseline_backlog = baseline_backlog;
    }

    public int getBaseline_cumul_in() {
        return baseline_cumul_in;
    }

    public void setBaseline_cumul_in(int baseline_cumul_in) {
        this.baseline_cumul_in = baseline_cumul_in;
    }

    public int getEac_backlog() {
        return eac_backlog;
    }

    public void setEac_backlog(int eac_backlog) {
        this.eac_backlog = eac_backlog;
    }

    public int getEac_cumul_in() {
        return eac_cumul_in;
    }

    public void setEac_cumul_in(int eac_cumul_in) {
        this.eac_cumul_in = eac_cumul_in;
    }

    public Date getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Date updated_on) {
        this.updated_on = updated_on;
    }
}
