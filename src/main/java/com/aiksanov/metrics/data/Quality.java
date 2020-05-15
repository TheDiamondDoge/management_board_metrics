package com.aiksanov.metrics.data;

import com.aiksanov.metrics.data.mappedSuperclasses.JiraExtendedFields;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pfm_quality_kpi")
public class Quality extends JiraExtendedFields {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "projectid")
    private int projectId;

    @Column(name = "crdbid")
    private String crdbId;

    @Column(name = "type")
    private String type;

    @Column(name = "tssubmitdate")
    private String TSsubmitDate;

    public Quality() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getCrdbId() {
        return crdbId;
    }

    public void setCrdbId(String crdbId) {
        this.crdbId = crdbId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTSsubmitDate() {
        return TSsubmitDate;
    }

    public void setTSsubmitDate(String TSsubmitDate) {
        this.TSsubmitDate = TSsubmitDate;
    }
}
