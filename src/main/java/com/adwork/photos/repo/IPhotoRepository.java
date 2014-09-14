package com.adwork.photos.repo;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.adwork.photos.model.Photos;

public interface IPhotoRepository extends SolrCrudRepository<Photos, String>{
	


}
