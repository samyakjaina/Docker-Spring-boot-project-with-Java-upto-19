
package com.example.DockerDemoProject.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.DockerDemoProject.service.JavaNewService;

/**
 * @author SAMYAK JAIN
 *
 */
@Component("java13ServiceImpl")
public class Java13ServiceImpl implements JavaNewService {

	@Override
	public Object allFeatures(String feature, Integer me, String switchOperation, String strMethod) {
		// yield is used to return anything

		Object data = switch (feature) {
		case "switch" -> switch (switchOperation) {
		case "doubleMe" -> {
			yield me * 2;
		}
		case "squareMe" -> {
			yield me * me;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + switchOperation);
		};
		case "json" -> {
			String TEXT_BLOCK_JSON = """
					{
					    "name" : "Balding",
					    "Opposite" : "https://www.%s.com/"
					}
					""";
			yield TEXT_BLOCK_JSON.toUpperCase();
		}
		case "string" -> switch (strMethod) {
		case "formatted" -> {
			String formattedTextBlock = """
					Person:
					Name: %s
					Age: %d
					""";
			String result = formattedTextBlock.formatted("samyak", "20");
			yield result;
		}
		case "translateEscapes" -> {
			String escapes = "This is tab \\t,\u005Cn Next New Line \n,next backspace \b,next Single Quotes \' next,Double Quotes \" ";
			String formattedTextBlock = """
					Result:

					before: %s

					after : %s
					""";
			String result = formattedTextBlock.formatted(escapes.translateEscapes(), escapes);
			yield result;
		}
		case "Stripindent" -> {
			String multiLineString = """
					       This is a
					    Malt-line
					    string
					    with indentation.
					""";
			yield multiLineString.stripIndent();
		}
		default -> throw new IllegalArgumentException("Unexpected value for String : " + strMethod);
		};
		case "ZGC" ->
			"Starting with Java 13, the ZGC now returns uncommitted memory to the operating system by default, up until the specified minimum heap size is reached. If we do not want to use this feature, we can go back to the Java 11 way by:\r\n"
					+ "\r\n" + "Using option -XX:-ZUncommit, or\r\n"
					+ "Setting equal minimum (-Xms) and maximum (-Xmx) heap sizes\r\n"
					+ "Additionally, ZGC now has a maximum supported heap size of 16TB. Earlier, 4TB was the limit.";
		case "Scoket" -> "problem ";
		default -> throw new IllegalArgumentException("Unexpected value: " + feature);
		};
		return data;
	}

	public static void main(String[] args) {
	        // Using stripIndent() with  a multi-line string
	        String multiLineString = """ 
This is a
	            multi-line
	            string with indentation.
	        """;

	        // Using stripIndent() to remove common leading indentation
	        String strippedString = multiLineString.stripIndent();

	        // Displaying the original and stripped strings
	        System.out.println("Original String:\n" + multiLineString);
	        System.out.println("\nStripped String:\n" + strippedString);
	    }

}
