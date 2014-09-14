package com.adwork.photos.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Repository;

import com.adwork.photos.model.Photos;

@Repository
public class PhotoRepository {

	@Autowired
	private SolrTemplate solrTemplate;
	
	public void addDocument(Photos photos){
		solrTemplate.setSolrCore("collection1");
		solrTemplate.saveBean(photos);
	}
}
