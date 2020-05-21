package com.aiksanov.metrics.data.repository;

import com.aiksanov.metrics.data.ChartData;
import com.aiksanov.metrics.data.pk.ChartPK;
import com.aiksanov.metrics.util.enums.ChartTypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChartRepo extends CrudRepository<ChartData, ChartPK> {
    List<ChartData> findByProjectIdAndMetricsType(int projectId, ChartTypes chartType);
}
