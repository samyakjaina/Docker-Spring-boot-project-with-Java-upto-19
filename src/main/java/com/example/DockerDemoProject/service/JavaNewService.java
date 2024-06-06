package com.example.DockerDemoProject.service;

import org.springframework.stereotype.Component;

/**
 * @author SAMYAK JAIN
 *
 */
@Component
public interface JavaNewService {

	/**
	 * @param feature
	 * @param me
	 * @param switchOperation
	 * @param strMethod
	 * @return
	 */
	public Object allFeatures(String feature, Integer me, String switchOperation, String strMethod);

}
