package com.adwork.photos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adwork.photos.model.Photos;
import com.adwork.photos.repo.PhotoRepository;

@Service
public class PhotosService {
	
	//@Resource
	//private IPhotoRepository photoRepository;
	
	@Autowired
	private PhotoRepository photoRepository;
	
	public void addToIndex(Photos photos){
		
		photoRepository.addDocument(photos);
	}

}
