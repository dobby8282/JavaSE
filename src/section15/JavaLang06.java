package section15;

public class JavaLang06 {
	public static void main(String[] args) {
		Integer num1 = 10;
		Integer num2 = 10000;
		
		/*
		 * compareTo()
		 * 
		 * ex) num1.compareTo(num2)
		 * 
		 * 결과가 양수이면 num1 > num2
		 * 결과가 음수이면 num1 < num2
		 * 결과가 0이면 두 수는 같다.
		 * 
		 */
		
		if(num1.compareTo(num2) > 0) {
			System.out.println("num1이 num2 보다 크다.");
		} else if (num1.compareTo(num2)  == 0) {
			System.out.println("num1과 num2는 같다.");
		} else {
			System.out.println("num1은 num2 보다 작다.");
		}
		
		// 문자열 숫자 값을 Integer로 변환
		String strNum = "999";
		Integer num3 = Integer.parseInt(strNum);
		
		num3 += 1;
		
		// Integer 값 문자열로 변환
		String strNum2 = num3.toString();
		
		System.out.println("strNum2: "+ strNum2);
		
		System.out.println("INT MAX: " + Integer.MAX_VALUE);
		System.out.println("INT MIN: " + Integer.MIN_VALUE);
		
		
		// 최소값 최대값 비교
		int minValue = Integer.min(num1, num2);
		int maxValue = Integer.max(num1, num2);
		
		System.out.println("최소값: " + minValue);
		System.out.println("최대값: " + maxValue);
		
		
		System.out.println("문자입니까? " + Character.isLetter('A'));
		System.out.println("숫자입니까? " + Character.isDigit('5'));
		System.out.println("공백입니까? " + Character.isWhitespace(' '));
		
	}
}



