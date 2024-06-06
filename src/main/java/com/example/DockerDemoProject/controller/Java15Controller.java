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
@RequestMapping("java15")
public class Java15Controller {
	@Autowired
	@Qualifier("java15ServiceImpl")
	JavaNewService javaNewService;

	/**
	 * @param feature
	 * @param me
	 * @param switchOperation
	 * @param strMethod
	 * @return
	 */
	@PostMapping("/action")
	public Object action(@RequestParam String feature, @RequestParam Integer me, @RequestParam String switchOperation,
			@RequestParam String strMethod) {
		return javaNewService.allFeatures(feature, me, switchOperation, strMethod);
	}

}