package section13;

import section13.access2.Bird;

/*
 * 익명클래스(Anonymous Class)
 * 	다른 내부클래스와 달리 이름이 없는 클래스
 * 	선언과 객체의 생성을 동시에 하므로 단 한번만 상용할 수 있다. (일회용 클래스)
 * 
 * 
 */
public class OuterClass05 {

	public static void main(String[] args) {
		
		Bird bird = new Bird() {	// Bird 인터페이스를 상속받은 익명클래스 이다.
			
			@Override
			public void sing() {
				System.out.println("새가 노래를 해요~*");
			}
			
			@Override
			public void fly() {
				System.out.println("하늘을 날아요~");
			}
		};
		
		bird.sing();
		bird.fly();
		
	}

}



