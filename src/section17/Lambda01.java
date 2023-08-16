package section17;
/*
 * Lambda 표현식
 * 	익명함수를 생성하기 위한 식이다.
 * 	함수를 하나의 식으로 표현한다.
 * 
 * 기존 메서드 방식
 * 반환타입 메서드명(매개변수, ...) {
 * 		코드영역
 * }
 * 
 * 람다표현식
 * (매개변수, ...) -> 코드영역 
 * (매개변수, ...) -> { return 코드영역; }; 
 *  
 */
public class Lambda01 {
	public static void main(String[] args) {
		
		// 1. 기존 익명클래스
		MyLambdaFunction mlf = new MyLambdaFunction() {
			
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
		System.out.println(mlf.max(3, 5));
		
		// 2. 람다식을 이용한 익명함수
		MyLambdaFunction mlf2 = (int a, int b) -> a > b ? a : b;
		System.out.println(mlf2.max(7, 9));
		
		
	}
}

@FunctionalInterface
interface MyLambdaFunction {
	int max(int a, int b);
}









