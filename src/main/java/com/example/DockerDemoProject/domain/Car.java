package com.example.DockerDemoProject.domain;

import org.springframework.stereotype.Component;

/**
 * @author SAMYAK JAIN
 *
 */
@Component
public sealed class Car extends Vechicle permits Bike {
	public String wheel() {
		return "car has 4 wheel ";
	};
}
