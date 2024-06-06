package com.example.DockerDemoProject.domain;

/**
 * @author SAMYAK JAIN
 *
 */
public sealed class Vechicle permits Car {

	public String wheel() {
		return "depends on the vechicle";
	};

}
