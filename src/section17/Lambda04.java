package section17;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda04 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 44, 17, 152, 41);
		
		numbers.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n * n)	// 각 요소의 연산을 반영한다.
				.forEach(System.out::println);
		
		System.out.println("==========================");
		
		List<Integer> numbers2 = 
					numbers.stream()
						.filter(n -> n % 2 == 0)
						.map(n -> n * n)	// 각 요소의 연산을 반영한다.
						.collect(Collectors.toList());	// 변환된 요소 List로 반환
		
		numbers2.stream().forEach(System.out::println);
		
		long count = numbers2.stream().count();
		System.out.println("count: " + count);
		
		
		

	}

}
