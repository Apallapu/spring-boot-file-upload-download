package com.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "FILEDB")
@Data
public class FileModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String fileName;

	private String fileType;

	@Lob
	private byte[] data;
}
