package com.adwork.photos.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;


public class Photos {
	
	@Id
	@Field
	private String id;
	
	@Field
	private String title;
	
	@Field
	private String description;
	
	@Field
	private String subject;
	
	@Field
	private String keyword;
	
	public Photos() {
		super();
	}
	
	public Photos(String title, String description, String subject,
			String keyword) {
		super();
		
		this.title = title;
		this.description = description;
		this.subject = subject;
		this.keyword = keyword;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
	

}
