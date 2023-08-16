package section17;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// 매개값을 사용해 조사 후 논리값을 반환
class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

// 매개값을 반환값으로 매핑하는 역할 Funtion 구현
class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
	
}

// 매개변수를 받아서 소비하는 역할. Consumer 구현
class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}


public class Lambda05 {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(23, 44, 17, 152, 41);
		
		numbers.stream()
				.filter(new EvenNumberPredicate())
				.map(new NumberSquareMapper())	// 각 요소의 연산을 반영한다.
				.forEach(new SystemOutConsumer());
		
	}

}
