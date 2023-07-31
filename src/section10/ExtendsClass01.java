package section10;

import section10.access1.*;

/*
 * 상속(Extends)
 * 	부모 클래스(상위 클래스)와 자식클래스(하위 클래스)가 있으며
 * 	자식 클래스는 부모 클래스를 상속받아 그 부모의 멤버(변수, 메소드) 사용이 가능하다.
 * 
 * 상속 방법
 * 	class 하위클래스명 extends 상위클래스명
 * 
 * 
 */
public class ExtendsClass01 {
	
	public static void main(String[] args) {
		Latte latte = new Latte();
		latte.name = "카페라떼";
		latte.isCold = false;
		latte.brand = "스타벅스";
		latte.price = 6000;
		
		latte.getInfo();
		
		
	}

}











