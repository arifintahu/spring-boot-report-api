package com.project.reportapi.model;

import javax.persistence.*;

@Entity
@Table(name = "report")
public class Report {
	private int id;
	private String issue;
	private String summary;
	private String url;
	private String extension_id;
	private int status;
	private String createdate;
	
	public Report() {
		
	}
	
	public Report(int id, String issue, String summary, String url, String extension_id, int status, String createdate) {
		this.id = id;
		this.issue = issue;
		this.summary = summary;
		this.url = url;
		this.extension_id = extension_id;
		this.status = status;
		this.createdate = createdate;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getIssue() {
		return issue;
	}
    public void setIssue(String issue) {
		this.issue = issue;
	}
    
    public String getSummary() {
		return summary;
	}
    public void setSummary(String summary) {
		this.summary = summary;
	}
    
    public String getUrl() {
		return url;
	}
    public void setUrl(String url) {
		this.url = url;
	}
    
    public String getExtension_id() {
		return extension_id;
	}
    public void setExtension_id(String extension_id) {
		this.extension_id = extension_id;
	}
    
    public int getStatus() {
		return status;
	}
    public void setStatus(int status) {
		this.status = status;
	}
    
    public String getCreatedate() {
		return createdate;
	}
    public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
}
