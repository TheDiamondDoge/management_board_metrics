package com.aiksanov.metrics.data.repository;

import com.aiksanov.metrics.data.Quality;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QualityRepository extends CrudRepository<Quality, Integer> {
    String qualityKpiQuery = "SELECT * FROM pfm_quality_kpi " +
            "WHERE projectId = ?1 AND inState in ('', 'None') AND outState in ('', 'None')";

    @Query(nativeQuery = true, value = qualityKpiQuery)
    Optional<List<Quality>> getQualityKpiIssues(int projectId);

}
