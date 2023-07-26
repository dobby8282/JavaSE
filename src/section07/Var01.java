package section07;
/*
 * 변수(variable)
 * 	데이터를 저장하고 참조하는데 사용되는 메모리 공간을 말한다.
 *
 * 변수 선언 및 초기화
 * 	자료형(type) 변수명 = 값, 참조클래스;
 * 
 * 	1. 타입의 따른 변수
 * 		기본형 - 예약어, 소문자로 시작, 직접 값을 저장하고 있다.
 * 			8가지 - boolean, char, byte, short, int, long, float, double
 * 		참조형 - 기본형 외 나머지 전부! 참조(주소)값을 가지고 있다. 보통 대문자로 시작
 * 			ex) String
 * 
 * 	2. 선언 위치에 따른 변수
 * 		전역변수	- 클래스안에 선언된 변수(멤버변수)
 * 				  초기화 하지 않으면 default 값이 들어간다.
 * 					boolean - false
 * 					정수형 - 0
 * 					실수형 - 0.0
 * 					참조형 - null
 * 					
 * 		지역변수	- 메소드 또는 생성자 안에 선언된 변수
 * 				  반드시 초기화를 해야한다! (컴파일 에러발생)
 * 				  메소드 종료시 같이 소멸된다.
 * 				  추가로 매개변수도 지역변수이다.
 * 
 * 	3. 정적(static) / 동적(일반) 변수
 * 		정적 - static 예약어로 선언
 * 			  모든 객체가 공유한다.
 * 			  클래스명으로 접근 가능
 * 			  객체 생성 없이 불러올 수 있다.
 *		동적 - static이 아닌 일반 멤버변수
 * 
 * 
 */
public class Var01 {
	
	// 전역 변수 (클래스 내부 선언된 변수)
	static int globalVar = 10;
	static double globalVar2;
	static int globalVar3;
	static boolean globalVar4;
	static String globalVar5;
	
	public static void main(String[] args) {
		
		localTest();
		
		System.out.println("main() 메서드 내에서 전역변수 호출: " + globalVar);
		
		System.out.println("globalVar2: " + globalVar2);
		System.out.println("globalVar3: " + globalVar3);
		System.out.println("globalVar4: " + globalVar4);
		System.out.println("globalVar5: " + globalVar5);
		
//		int localVar1;
//		System.out.println("localVar1: " + localVar1);
		
		int globalVar = 20;
		
		System.out.println("globalVar: " + globalVar);
		System.out.println("전역변수 접근: "+ Var01.globalVar);
		
	}
	
	public static void localTest() {
		// 지역변수 메서드 블록내에 선언
		int localVar = 20;
		System.out.println("전역 변수를 메서드 내에서 사용: " + globalVar);
		System.out.println("블록 내 지역 변수 값: " + localVar);
	}

}




