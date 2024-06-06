package com.example.DockerDemoProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DockerDemoProject.service.JavaNewService;

/**
 * @author SAMYAK JAIN
 *
 */
@RestController
@RequestMapping("java14")
public class Java14Controller {
	@Autowired
	@Qualifier("java14ServiceImpl")
	JavaNewService javaNewService;

	/**
	 * @param feature
	 * @param integer
	 * @param switchOperation
	 * @param strMethod
	 * @return
	 */
	@PostMapping("/action")
	public Object action(@RequestParam String feature, @RequestParam Integer integer,
			@RequestParam String switchOperation, @RequestParam String strMethod) {
		return javaNewService.allFeatures(feature, integer, switchOperation, strMethod);
	}

}
