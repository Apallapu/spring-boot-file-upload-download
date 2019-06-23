package com.poc.service;

import org.springframework.web.multipart.MultipartFile;

import com.poc.model.FileModel;

public interface FileStorageService {

	public FileModel storeFile(MultipartFile file);

	public FileModel getFile(String fileId);

}
