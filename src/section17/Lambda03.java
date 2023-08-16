package section17;

import java.util.Arrays;
import java.util.List;

public class Lambda03 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 7, 8, 99, 66);
		
//		int sum = nomalSum(numbers);
		int sum = fpSum(numbers);
		System.out.println("합계 : " + sum);
	}
	
	private static int nomalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	// reduce - 스트림요소들을 결합하여 단일 결과를 생성
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, (sum, number) -> sum + number);
	}
	
	
	

}







