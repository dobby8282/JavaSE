package section10;

import section10.access1.Latte;
import section10.access2.Car;

/*
 * 패키지(Package)
 * 	관련된 클래스, 인터페이스 등 그룹화하는데 사용되는 디렉토리
 * 
 * 	이름충돌 방지 : 같은이름 클래스, 인터페이스 페키지를 달리하여 충돌 방지
 * 	코드 구조화 : 관련된 클래스를 패키지 단위로 그룹화
 * 	접근 제어 : 클래스나 멤버에 접근제한자를 적용하여, 해당 패키지 외부에서 접근제한 가능
 * 
 * 접근 제한자(Access Modifier)
 * 	자바에서 클래스, 멤버변수, 메소드 등 접근 범위를 제어하는데 사용되는 키워드
 * 		public 		-	모든 클래스에서 접근 가능.
 * 		protected 	-	같은 패키지 또는 상속 관계에서 접근 가능.
 * 		default		-	같은 패키지에서 접근 가능.
 * 		private 	-	본인 클래스 내에서 접근 가능.
 * 
 * import 키워드
 * 	다른 패키지에 속한 클래스를 사용하기 위해 선언하는 키워드.
 * 
 * Ctrl + Shift + o : import 단축키
 * 
 */
public class ExtendsClass03 {
	public static void main(String[] args) {
		Car car = new Car();
		car.model = "제네시스 GV80";
//		car.color = "black";	// protected 다른패키지 접근불가
//		car.year = 2023;		// default 다른패키지 접근불가
//		car.brand = "Hyundai";	// private 다른클래스 접근불가
		
		car.getInfo();
	}
}









