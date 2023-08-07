package section12;

import section12.access3.BluetoothMIC;
import section12.access3.Microphone;
import section12.access3.Speaker;
import section12.access3.TJmic;

/*
 * 인터페이스 상속
 * 	인터페이스끼리 상속관계를 만들수 있다.
 * 	클래스 상속과 마찬가지로 extends 키워드 사용한다.
 * 	다중 상속이 가능하다. 콤마(,) 사용
 * 
 */
public class InterfaceClass02 {
	
	public static void main(String[] args) {
		System.out.println("---TJmic 객체---");
		TJmic tj = new TJmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		System.out.println("---BluetoothMIC로 타입 변환---");
		BluetoothMIC bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("---Microphone으로 타입 변환---");
		Microphone m = tj;
		// m.connect(); 
		// m.music();
		m.sing();
		
		System.out.println("---Speaker로 타입 변환---");
		Speaker s = tj;
		// s.connect();
		s.music();
		// s.sing();
	}
	
}







