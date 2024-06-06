package com.example.DockerDemoProject.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.DockerDemoProject.service.*;

/**
 * @author SAMYAK JAIN
 *
 */
@Component("java17To19ServiceImpl")
public class Java17To19ServiceImpl implements JavaNewService {

	@SuppressWarnings({ "rawtypes", "removal" })
	@Override
	public Object allFeatures(String feature, Integer me, String switchOperation, String strMethod) {

		// java 19 features
		Map maps = new HashMap<>(80);
//		Map map = HashMap.newHashMap(80);

		ThreadGroup th = new ThreadGroup("sa");
		th.isDestroyed();
		th.setDaemon(false);
		th.isDaemon();
		th.suspend();
		th.resume();
		th.stop();

//		// java 17 features
//		Object obj = "";
//		return getNumberOfWheel(obj);
		return null;
	}

//	private void print(Object o) {
//		if (o instanceof Java15ServiceImpl(String name)) {
//			System.out.println("object is a position, x =");
//		}
//	}
//
//	public String getNumberOfWheel(Object obj) {
//		return switch (obj) {
//		case Integer i -> "It is an integer";
//		case String s -> "It is a string";
//		default -> "It is none of the known data types";
//		};
//	}
//
//	public static void main(String[] args) {
//		Java17To19ServiceImpl java = new Java17To19ServiceImpl();
//		Object obj = 1;
////		System.out.println(java.getNumberOfWheel(obj));
//	}

}
