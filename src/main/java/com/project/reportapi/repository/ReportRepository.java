package com.project.reportapi.repository;

import com.project.reportapi.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReportRepository extends JpaRepository<Report, Integer> {
	
	@Query(value = "SELECT COUNT(s) FROM Report s WHERE s.extension_id=:extension_id AND s.status=:status")
	public long countExtStatus(String extension_id, Integer status);
	
}
