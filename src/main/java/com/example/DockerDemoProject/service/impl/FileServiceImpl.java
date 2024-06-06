package com.example.DockerDemoProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.DockerDemoProject.domain.ExcelFileEntity;
import com.example.DockerDemoProject.repository.FileRepository;
import com.example.DockerDemoProject.service.FileService;

/**
 * @author SAMYAK JAIN
 *
 */
@Component
public class FileServiceImpl implements FileService {
	@Autowired
	FileRepository fileRepository;

	@Override
	public List<ExcelFileEntity> findAll() {
		// TODO Auto-generated method stub
		return fileRepository.findAll();
	}

}
