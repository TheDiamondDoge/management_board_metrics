package com.aiksanov.metrics.dto;

import com.aiksanov.metrics.data.Backlog;
import com.aiksanov.metrics.data.NewOpenDefects;
import com.aiksanov.metrics.data.Quality;

import java.util.List;

public class QualityIndicatorsDTO {
    private List<NewOpenDefects> defects;
    private List<Quality> qualities;
    private List<Backlog> backlogs;

    public QualityIndicatorsDTO() {
    }

    public QualityIndicatorsDTO(List<NewOpenDefects> defects, List<Quality> qualities, List<Backlog> backlogs) {
        this.defects = defects;
        this.qualities = qualities;
        this.backlogs = backlogs;
    }

    public List<NewOpenDefects> getDefects() {
        return defects;
    }

    public QualityIndicatorsDTO setDefects(List<NewOpenDefects> defects) {
        this.defects = defects;
        return this;
    }

    public List<Quality> getQualities() {
        return qualities;
    }

    public QualityIndicatorsDTO setQualities(List<Quality> qualities) {
        this.qualities = qualities;
        return this;
    }

    public List<Backlog> getBacklogs() {
        return backlogs;
    }

    public QualityIndicatorsDTO setBacklogs(List<Backlog> backlogs) {
        this.backlogs = backlogs;
        return this;
    }
}
