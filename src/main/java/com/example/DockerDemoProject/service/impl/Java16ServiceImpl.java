package com.example.DockerDemoProject.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.DockerDemoProject.service.JavaNewService;

/**
 * @author SAMYAK JAIN
 *
 */
@Component("java16ServiceImpl")
public class Java16ServiceImpl implements JavaNewService {

	@Override
	public Object allFeatures(String feature, Integer me, String switchOperation, String strMethod) {
		// yield is used to return anything

		Object data = switch (feature) {
		case "streamToList" -> {
			List<String> integersAsString = Arrays.asList("1", "2", "3");
//			List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
			List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
			yield intsEquivalent.toString();
		}

		default -> throw new IllegalArgumentException("Unexpected value: " + feature);
		};
		return data;
	}

}
