package com.project.reportapi.service;

import com.project.reportapi.model.Report;
import com.project.reportapi.repository.ReportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReportService {
	@Autowired
	private ReportRepository reportRepository;
	
	public List<Report> listAllReport() {
		return reportRepository.findAll();
	}
	
	public void saveReport(Report report) {
		reportRepository.save(report);
	}
	
	public Report getReport(Integer id) {
		return reportRepository.findById(id).get();
	}
	
	public void deleteReport(Integer id) {
		reportRepository.deleteById(id);
	}
}
