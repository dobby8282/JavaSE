package day11;

import java.util.List;

public class MainClass02 {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		// 기존방법
		printBasic(list);
		
		// 람다식방법
		printWithFP(list);
		
		printBasicWithFiltering(list);
		
		
		printWithFPWithFiltering(list);
		

	}
	// 기존 확장포문 이용
	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	// stream forEach 람다식 
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}
	
	
	// 기존 확장포문 필터 if문 이용
	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	
	// stream forEach 람다식 필터 적용
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element - " + element));
	}



}
