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

    public void getAll() {
        Iterable<Backlog> backlogs = this.backlogRepository.findAll();
        backlogs.forEach(System.out::println);
    }

    public List<Backlog> getBacklogKpiIssues(int projectId) {
        return this.backlogRepository.getBacklogKpiIssues(projectId).orElseGet(ArrayList::new);
    }
}
