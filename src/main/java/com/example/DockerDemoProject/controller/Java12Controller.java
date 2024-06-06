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
@RequestMapping("java12")
public class Java12Controller {
	@Autowired
	@Qualifier("java12ServiceImpl")
	JavaNewService javaNewService;

	/**
	 * @param strMethod
	 * @param feature
	 * @param switchOperation
	 * @return
	 */
	@PostMapping("/action")
	public Object action(@RequestParam String strMethod, @RequestParam String feature,
			@RequestParam String switchOperation) {
		return javaNewService.allFeatures(feature, 0, switchOperation, strMethod);
	}

}
