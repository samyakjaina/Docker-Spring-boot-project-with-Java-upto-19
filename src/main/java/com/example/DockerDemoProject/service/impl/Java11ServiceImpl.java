package com.example.DockerDemoProject.service.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.DockerDemoProject.service.JavaNewService;

import jakarta.annotation.Nonnull;

/**
 * @author SAMYAK JAIN
 *
 */
@Component("java11ServiceImpl")
@Service
public class Java11ServiceImpl implements JavaNewService {

	@Value("${path.to.folder}")
	private String path;

//	@Override
//	public void collectionToArray() {
//		List<String> sampleList = Arrays.asList("Java", "Kotlin", "");
//		String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
//		for (String str : sampleArray) {
//			System.out.println(str);
//		}
//	}
//
//	@Override
//	public void notPredicate() {
//		List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
//		List<String> withoutBlanks = sampleList.stream().filter(Predicate.not(String::isBlank))
//				.collect(Collectors.toList());
//		System.out.println(withoutBlanks);
//	}
//
//	@SuppressWarnings("unused")
//	@Override
//	public void lambda() {
//		int value = 42;
//		List<String> sampleList = Arrays.asList("Java", "Kotlin");
//		String resultString = sampleList.stream().map((@Nonnull var x) -> x.toUpperCase())
//				.collect(Collectors.joining(", "));
//		System.out.println(resultString);
//	}
//
//	public static void main(String[] argss) throws IOException {
//		Java11ServiceImpl impl = new Java11ServiceImpl();
//		// collectionToArray();
//		String value = impl.fileCreation();
//		System.out.println(value);
//	}
//
//	@Override
//	public String fileCreation() {
//		String fileContent = "";
//		try {
//			Path tempDirectory = Path.of("/home");
//			Path file = Files.createTempFile(tempDirectory, "demo", ".txt");
//			System.out.println("created");
//			Path filePath = Files.writeString(file, "Sample text");
//			fileContent = Files.readString(filePath);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "Getting error in file creation" + e.getMessage();
//		}
//		System.out.println(fileContent);
//		return "Successfully created";
//	}

	@Override
	public Object allFeatures(String feature, Integer me, String switchOperation, String strMethod) {
		// yield is used to return anything

		Object data = switch (feature) {
		case "fileCreation" -> {
			String fileContent = "";
			try {
				Path tempDirectory = Path.of("/home");
				Path file = Files.createTempFile(tempDirectory, "demo", ".txt");
				System.out.println("created");
				Path filePath = Files.writeString(file, "Sample text");
				fileContent = Files.readString(filePath);
			} catch (Exception e) {
				e.printStackTrace();
				yield "Getting error in file creation" + e.getMessage();
			}
			System.out.println(fileContent);
			yield "Successfully created";
		}
		case "lamda" -> {
			int value = 42;
			List<String> sampleList = Arrays.asList("Java", "Kotlin");
			String resultString = sampleList.stream().map((@Nonnull var x) -> x.toUpperCase())
					.collect(Collectors.joining(", "));
			System.out.println(resultString);
			yield resultString;
		}
		case "notPredicate" -> {
			List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
			List<String> withoutBlanks = sampleList.stream().filter(Predicate.not(String::isBlank))
					.collect(Collectors.toList());
			yield withoutBlanks;
		}
		case "collectionToArray" -> {
			List<String> sampleList = Arrays.asList("Java", "Kotlin", "");
			String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
			for (String str : sampleArray) {
				System.out.println(str);
			}
			yield sampleArray;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + feature);
		};
		return data;
	}

}
