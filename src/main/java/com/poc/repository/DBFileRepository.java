package com.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.model.FileModel;

@Repository
public interface DBFileRepository extends JpaRepository<FileModel, String> {

}
