package section17;

import java.util.Arrays;
import java.util.List;

/*
 * 스트림(Stream)
 * 	데이터 처리와 컬렉션을 다루는데에 사용되는 선언적이고 함수형 스타일의 API이다.
 * 	컬렉션을 스트림으로 변환하여 조작, 필터링, 매핑 등 효율적이고 간결하게 수행가능.
 * 
 */
public class Lambda02 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Apple", "Bat", "Cat", "Dog");
		
//		printBasic(names);
//		System.out.println("===================");
//		printWithFP(names);
		
		printBasicWithFiltering(names);
		System.out.println("==================");
		
		printWithFpFiltering(names);
	}
	
	private static void printBasic(List<String> list) {
		for(String element : list) {
			System.out.println(element);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream()
			.forEach(element -> System.out.println("element - " + element));
	}
	
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String element : list) {
			if(element.endsWith("at")) {
				System.out.println(element);
			}
		}
	}
	
	private static void printWithFpFiltering(List<String> list) {
		list.stream()
			.filter(element -> element.endsWith("at"))
			.forEach(element -> System.out.println("element - " + element));
	}
	
}







