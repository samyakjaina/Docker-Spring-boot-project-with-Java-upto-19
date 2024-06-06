package com.example.DockerDemoProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.DockerDemoProject.domain.ExcelFileEntity;

/**
 * @author SAMYAK JAIN
 *
 */
@Service
public interface FileService {

	public List<ExcelFileEntity> findAll();

}
