package com.test.performance.mongodb.repository;

import com.test.performance.mongodb.model.Report;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<Report, String> {

    Page<Report> findAllByGroupAndEnabledIsTrue(String group, Pageable pageable);

    Page<Report> findAllByEnabledIsTrue(Pageable pageable);

}
