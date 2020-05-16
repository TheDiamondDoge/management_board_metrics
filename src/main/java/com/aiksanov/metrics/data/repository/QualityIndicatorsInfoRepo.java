package com.aiksanov.metrics.data.repository;

import com.aiksanov.metrics.data.QualityIndicatorsInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualityIndicatorsInfoRepo extends CrudRepository<QualityIndicatorsInfo, Integer> {
}
