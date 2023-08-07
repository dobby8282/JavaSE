package section13.access1;

public class MyUtil {
	
	public String str1 = "일반멤버 변수";
	public static String str2 = "정적멤버 변수";
	
	public class HelloPrinter {
		public void printHello() {
			System.out.println("인스턴스 내부클래스 HelloPrinter 입니다.");
			System.out.println(str1);	// 1. 사용가능 ? 가능
			System.out.println(str2);	// 2. 사용가능 ? 가능
		}
	}
	
	public static class Calculater {
		public void calc(int a, int b) {
			System.out.println("전달 받은 두 정수의 합: " + (a + b));
			// System.out.println(str1);	// 3. 사용가능 ? 불가능
			// System.out.println(str2);	// 4. 사용가능 ? 가능
		}
	}
	
	
}
