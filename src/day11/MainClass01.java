package day11;


/*
 * [[ Lambda 표현식 ]]
 * 
 * 	람다식(Lambda Expression)이란 함수를 하나의 식(expression)으로 표현한 것이다. 
 * 	함수를 람다식으로 표현하면 메소드의 이름이 필요 없기 때문에, 
 * 	람다식은 익명 함수(Anonymous Function)의 한 종류라고 볼 수 있다.
 * 
 * // 기존의 방식
 *	반환티입 메소드명 (매개변수, ...) {
 *		실행문
 *	}
 *	
 *	// 예시
 *	public String hello() {
 *	    return "Hello World!";
 *	}
 * 
 *  // 람다 방식
 *  (매개변수, ... ) -> { 실행문 ... }
 *  
 *  // 예시
 *  () -> "Hello World!";
 * 
 * 
 */

public class MainClass01 {
	
	public static void main(String[] args) {
		// 1. 기존의 익명클래스
		System.out.println(new MyLambdaFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		}.max(3, 5));
		
		
		// 2. 람다식을 이용한 익명클래스
		MyLambdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b;
		System.out.println(lambdaFunction.max(3, 5));
		
		
	}
}


@FunctionalInterface
interface MyLambdaFunction {
	int max(int a, int b);
}





















