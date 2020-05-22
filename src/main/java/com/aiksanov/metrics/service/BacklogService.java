package com.aiksanov.metrics.service;

import com.aiksanov.metrics.data.Backlog;
import com.aiksanov.metrics.data.repository.BacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BacklogService {
    private BacklogRepository backlogRepository;

    @Autowired
    public BacklogService(BacklogRepository backlogRepository) {
        this.backlogRepository = backlogRepository;
    }

    public List<Backlog> getBacklogKpiIssuesWithoutNone(int projectId) {
        return this.backlogRepository.getBacklogKpiIssues(projectId).orElseGet(ArrayList::new);
    }

    public List<Backlog> getBacklogKpiIssuesAll(int projectId) {
        return this.backlogRepository.findByProjectId(projectId).orElseGet(ArrayList::new);
    }
}
