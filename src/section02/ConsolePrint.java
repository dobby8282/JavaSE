package section02;
/*
 * 출력문
 * 	데이터를 화면에 출력하는 방법
 * 
 * System.out.println() : 괄호안 내용 출력 후 행 바꿈
 * System.out.print() : 괄호안 내용 출력 행 바꿈 X
 * System.out.printf() : 문자열 서식 문자를 이용해 형식화된 내용 출력 행 바꿈 X
 * 
 * 서식문자
 * 		%d : 정수(10진수)
 * 		%o : 정수(8진수)
 * 		%x : 정수(16진수)
 * 		%f : 실수
 * 		%e : 지수(e표기 기반)
 * 		%g : 출력 대상에 따라 %e 또는 %f 형태로 출력
 * 		%s : 문자열
 * 		%c : 문자
 * 
 */
public class ConsolePrint {
	public static void main(String[] args) {
		System.out.print("Welcom.");
		
		System.out.println("Java World");
		
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 7, 14);
		
		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째.\n", 1, 2.0, "셋");
	}
}









