package com.example.DockerDemoProject.service.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.DockerDemoProject.service.JavaNewService;
/**
 * @author SAMYAK JAIN
 *
 */
@Component("java12ServiceImpl")
public class Java12ServiceImpl implements JavaNewService {

	@Override
	public Object allFeatures(String feature, Integer me, String switchOperation, String str) {
		Object data = switch (feature) {
		case "instance" -> {
			Integer length = 0;
			Object obj = new String("das");
			if (obj instanceof String s) {
				length = s.length();
			}
			yield length;
		}
		case "compactNumber" -> {
			NumberFormat likesShort = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
					NumberFormat.Style.SHORT);
			likesShort.setMaximumFractionDigits(4);
			yield likesShort.format(259211);

		}
		case "teeing" -> {
			yield Stream.of(1, 2, 3, 4, 5, 5, 6).collect(Collectors.teeing(Collectors.summingDouble(i -> i),
					Collectors.counting(), (sum, count) -> sum / count));
		}
		case "mismatch" -> {
			Long mismatch = null;
			try {
				Path tempDirectory = Path.of("D://db");
				Path filePath1 = Files.createTempFile(tempDirectory, "file1", ".txt");
				Path filePath2 = Files.createTempFile(tempDirectory, "file2", ".txt");
				Files.writeString(filePath1, "Jqva 12 Article");
				Files.writeString(filePath2, "Java 12 Article");

				// if the file content are same then it return -1 otherwise it will return the
				// first index
				mismatch = Files.mismatch(filePath1, filePath2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			yield mismatch;
		}
		case "string" -> switch (feature) {
		case "indent" -> {
			yield str.indent(4);
		}
		case "transform" -> {
			yield str.transform(s -> {
				List<String> list = Arrays.asList(s.split(",")).stream().map(trim -> trim.trim())
						.map(add -> add.concat(" sahi ha ")).collect(Collectors.toList());
				return list;
			});
		}
		default -> throw new IllegalArgumentException("Unexpected value for String : " + feature);
		};
		default -> throw new IllegalArgumentException("Unexpected value for feature : " + feature);
		};
		return data;
	}

	public static void main(String args[]) {
		Java12ServiceImpl java12 = new Java12ServiceImpl();
		System.out.println(java12.allFeatures("transform", 1, "string", "Hello Baeldung!,This is Java 12 article."));
	}

}
