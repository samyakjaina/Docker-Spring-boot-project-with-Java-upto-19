package com.example.DockerDemoProject.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SAMYAK JAIN
 *
 */
@RestController
@RequestMapping("java16")
@Component
public non-sealed class Bike extends Car {
	public String wheel() {
		return "bike has 2 wheel";
	};
}
