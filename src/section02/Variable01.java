package section02;
/*
 * 1. 논리형(boolean)
 * 	true 또는 false 두가지 값을 가지는 기본 자료형
 * 	1byte
 * 
 * 선언방법
 * 	boolean 변수명;
 * 
 */
public class Variable01 {
	public static void main(String[] args) {
		// 논리형 변수 선언하기
		boolean isBool;
		// 선언한 변수에 값 대입하기
		isBool = true;
		
		System.out.println("논리형 변수에 저장된 값: " + isBool);
		
		// 선언과 동시에 대입하기
		boolean isRun = false;
		
		// 변수 값 변경
		isRun = true;
		System.out.println("논리형 변수 isRun 값: " + isRun);
		
	}
}












