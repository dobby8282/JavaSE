package section12;

import section12.access2.Cat;
import section12.access2.HouseCat;
import section12.access2.PersianCat;
import section12.access2.Playable;

/*
 * 인터페이스(interface)
 * 	추상화된 타입을 정의 하는데 사용되는 개념
 * 	추상메서드와 상수로만 이루어져 있다.
 * 	다중 상속이 가능하다.
 * 	'implements' 키워드로 상속 한다.
 * 
 * 객체의 구조(뼈대)를 설계하는 역할을 한다. (기능 정의)
 * 	
 */

public class InterfaceClass01 {
	public static void main(String[] args) {
		PersianCat pCat = new PersianCat();
		pCat.eat();
		
		// pCat.PAW = 2; // 인터페이스 상수 변경불가!
		
		Cat hCat = new HouseCat();
		hCat.hunt();
		
		HouseCat hCat2 = (HouseCat) hCat;
		hCat2.play();
		
		Playable hCat3 = hCat2;
		hCat3.play();
		
	}

}






