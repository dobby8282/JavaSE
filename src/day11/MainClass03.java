package day11;

import java.util.List;

public class MainClass03 {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
		int sum = fpSum(numbers);
			
		System.out.println(sum);

	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, 
					(sum, number) ->  sum + number);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number; 
		}
		return sum;
	}

}
