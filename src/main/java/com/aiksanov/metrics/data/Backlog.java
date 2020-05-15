package com.aiksanov.metrics.data;

import com.aiksanov.metrics.data.mappedSuperclasses.JiraExtendedFields;
import com.aiksanov.metrics.data.pk.BacklogPK;

import javax.persistence.*;

@Entity
@Table(name = "pfm_backlog_at_dr1")
@IdClass(BacklogPK.class)
public class Backlog extends JiraExtendedFields {
    @Id
    @Column(name = "projectid")
    private int projectId;

    @Id
    @Column(name = "crdbid")
    private String crdbId;

    @Column(name = "inbacklogatdr4")
    private String inBacklogAtDR4;

    @Column(name = "backlogreduction")
    private String backlogReduction;

    public Backlog() {
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

    public String getInBacklogAtDR4() {
        return inBacklogAtDR4;
    }

    public void setInBacklogAtDR4(String inBacklogAtDR4) {
        this.inBacklogAtDR4 = inBacklogAtDR4;
    }

    public String getBacklogReduction() {
        return backlogReduction;
    }

    public void setBacklogReduction(String backlogReduction) {
        this.backlogReduction = backlogReduction;
    }
}
