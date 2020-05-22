package com.aiksanov.metrics.data.repository;

import com.aiksanov.metrics.data.NewOpenDefects;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DefectsRepository extends CrudRepository<NewOpenDefects, Integer> {
    String defectsKpiQuery = "SELECT * FROM pfm_new_open_defects " +
            "WHERE projectId = ?1 AND inState in ('', 'None') AND outState in ('', 'None')";

    @Query(nativeQuery = true, value = defectsKpiQuery)
    Optional<List<NewOpenDefects>> getDefectsKpiIssues(int projectId);
    Optional<List<NewOpenDefects>> findByProjectId(int projectId);
}
