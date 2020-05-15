package com.aiksanov.metrics.data.pk;

import java.io.Serializable;
import java.util.Objects;

public class BacklogPK implements Serializable {
    private int projectId;
    private String crdbId;

    public BacklogPK() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BacklogPK backlogPK = (BacklogPK) o;
        return projectId == backlogPK.projectId &&
                Objects.equals(crdbId, backlogPK.crdbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, crdbId);
    }
}
