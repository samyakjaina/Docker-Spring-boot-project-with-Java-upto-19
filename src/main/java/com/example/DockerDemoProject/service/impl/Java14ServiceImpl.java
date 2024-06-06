package com.example.DockerDemoProject.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.DockerDemoProject.service.JavaNewService;

/**
 * @author SAMYAK JAIN
 *
 */
@Component("java14ServiceImpl")
public record Java14ServiceImpl(int age, String name) implements JavaNewService {

	public Java14ServiceImpl() {
		/*
		 * to create this constructor we have to call record created constructor
		 * explicity otherwise it wouldn't allow you to created it .
		 */
		this(23, "Samyak Jain");
	}

	@Override
	public Object allFeatures(String feature, Integer me, String switchOperation, String strMethod) {
		// yield is used to return anything

		Object data = switch (feature) {
		case "slash" -> {
			// \ this is used for notify that it is the end of the line you can't add any
			// character
			yield """
					A quick brown fox jumps over a lazy dog;\
					the lazy dog howls loudly.""";
		}
		case "slashs" -> {
			// \s is used to notify single space
			yield """
					A quick brown fox jumps over a lazy dog;\s
					the lazy dog howls loudly.""";
		}
		case "record" -> {
			/*
			 * what record keyword do is that it implicity create the getter , setter ,
			 * hashcode , equals and toString of the properties you have mention in the
			 * constructor at the top of the class while using record .
			 * 
			 * equals method is override for content comparsion
			 */
			Java14ServiceImpl recordCons = new Java14ServiceImpl(23, "Samyak Jain");
			String formattedTextBlock = """
					 Result:
					 constructor  Name : %s
					 constructor  Age  : %s
					 constructor  hashCode : %s
					 constructor  toString : %s
					""";
			String result = formattedTextBlock.formatted(recordCons.name(), recordCons.age(), recordCons.hashCode(),
					recordCons.toString());
			yield result;
		}
		case "NPE" -> {
			/*
			 * Now in null pointer exception we get the variable name in which NPE is coming
			 * like in this case this will come :- Exception in thread "main"
			 * java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because
			 * "str" is null
			 */
			String str = null;
			yield str.toLowerCase();
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + feature);
		};
		return data;
	}

	public static void main(String args[]) {
		String multiline = "sas";
		Java14ServiceImpl java14 = new Java14ServiceImpl(1, "samyak");
		Java14ServiceImpl java143 = new Java14ServiceImpl(1, "samyak");
//		Java14ServiceImpl java114 = new Java14ServiceImpl(23, "Samyak Jain");
//		System.out.println(java14.allFeatures("NPE", 0, "", ""));
		System.out.println(java14.equals(java143));
	}
}
