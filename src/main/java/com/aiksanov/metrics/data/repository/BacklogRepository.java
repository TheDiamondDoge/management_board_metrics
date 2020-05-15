package com.aiksanov.metrics.data.repository;

import com.aiksanov.metrics.data.Backlog;
import com.aiksanov.metrics.data.pk.BacklogPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, BacklogPK> {
    String backlogKpiQuery = "SELECT * FROM pfm_backlog_at_dr1 " +
            "WHERE projectID = ?1 AND backlogReduction = 'y'";

    @Query(nativeQuery = true, value = backlogKpiQuery)
    Optional<List<Backlog>> getBacklogKpiIssues(int projectId);
}
