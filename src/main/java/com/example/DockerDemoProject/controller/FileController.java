package com.example.DockerDemoProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DockerDemoProject.domain.ExcelFileEntity;
import com.example.DockerDemoProject.service.FileService;

/**
 * @author SAMYAK JAIN
 *
 */
@RestController
@RequestMapping("/file")
public class FileController {

	@Autowired
	FileService fileService;

	/**
	 * @return
	 */
	@GetMapping("/findAll")
	public List<ExcelFileEntity> findAll() {
		return fileService.findAll();
	}

	/**
	 * @return
	 */
	@GetMapping("/call")
	public String call() {
		return "called yes ";
	}
}
