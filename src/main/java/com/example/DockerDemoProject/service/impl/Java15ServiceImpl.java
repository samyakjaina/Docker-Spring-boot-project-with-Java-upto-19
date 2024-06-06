package com.example.DockerDemoProject.service.impl;

import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.DockerDemoProject.service.JavaNewService;
/**
 * @author SAMYAK JAIN
 *
 */
@Component("java15ServiceImpl")
public record Java15ServiceImpl(String name) implements JavaNewService {

//	public Java15ServiceImpl {
//		if (name == null) {
//			throw new NullPointerException();
//		}
//	}
	public Java15ServiceImpl() {
		/*
		 * to create this constructor we have to call record created constructor
		 * explicity otherwise it wouldn't allow you to created it .
		 */
		this("Samyak Jain");
	}

	@Override
	public Object allFeatures(String feature, Integer me, String switchOperation, String strMethod) {
		// yield is used to return anything

		Object data = switch (feature) {
		case "instanceOf" -> {
			Object obj = "String";
			/*
			 * we can now add condition after using instanceof if the instance matched then
			 * it automatically convert the obj into the str string and then we can check
			 * whatever condition we wants to check .
			 */
			if (obj instanceof String str && str.length() > 3) {
				yield "string length  is greater than 3";
			}
			yield "String length is lesser than 3 ";
		}

		default -> throw new IllegalArgumentException("Unexpected value: " + feature);
		};
		return data;
	}

	public static void main(String[] args) {
//		Calendar calendar = Calendar.getInstance();
//
//		// Subtract one day
//		calendar.add(Calendar.DAY_OF_MONTH, -1);
//
//		// Set the time to 1:00 PM
//		calendar.set(Calendar.HOUR_OF_DAY, 12);
//		calendar.set(Calendar.MINUTE, 24);
//		calendar.set(Calendar.SECOND, 0);
//		calendar.set(Calendar.MILLISECOND, 0);
//
//		// Get the Timestamp for yesterday at 1:00 PM
//		Timestamp yesterdayTimestamp = new Timestamp(calendar.getTimeInMillis());
//
//		Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
//		long diffInMillis = currentTimestamp.getTime() - yesterdayTimestamp.getTime();
//		long diffInHours = diffInMillis / (60 * 60 * 1000);
//		if (diffInHours > 23) {
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
		Date date = new Date(1707394435000L);
		Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		System.out.println(format.format(date));
	}

}
