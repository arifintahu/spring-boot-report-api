package com.project.reportapi.controller;

import com.project.reportapi.model.Report;
import com.project.reportapi.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/report")
public class ReportController {
	@Autowired
	ReportService reportService;
	
	@GetMapping("")
    public List<Report> list() {
        return reportService.listAllReport();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Report> get(@PathVariable Integer id) {
        try {
            Report report = reportService.getReport(id);
            return new ResponseEntity<Report>(report, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Report>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("")
    public void add(@RequestBody Report report) {
        reportService.saveReport(report);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Report report, @PathVariable Integer id) {
        try {
            Report existReport = reportService.getReport(id);
            report.setId(id);
            reportService.saveReport(report);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        reportService.deleteReport(id);
    }
    
}
