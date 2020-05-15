package com.aiksanov.metrics.data;

import com.aiksanov.metrics.data.mappedSuperclasses.JiraExtendedFields;

import javax.persistence.*;

@Entity
@Table(name = "pfm_new_open_defects")
public class NewOpenDefects extends JiraExtendedFields {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "projectid")
    private int projectId;

    @Column(name = "crdbid")
    private String crdbId;

    @Column(name = "tssubmitdate")
    private String TSsubmitDate;

    public NewOpenDefects() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTSsubmitDate() {
        return TSsubmitDate;
    }

    public void setTSsubmitDate(String TSsubmitDate) {
        this.TSsubmitDate = TSsubmitDate;
    }
}
