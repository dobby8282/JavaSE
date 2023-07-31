package section10;

import section10.access4.Jindo;

/*
 * final 클래스
 * 	클래스앞에 final 키워드 추가할 경우, 클래스 상속의 마지막임을 뜻한다.
 * 
 * final 메서드
 * 	메서드에 final 선언하면 해당 메서드는 하위클래스에서 오버라이딩할 수 없다.
 * 
 */

public class ExtendsClass04 {
	
	public static void main(String[] args) {
		Jindo jindo = new Jindo();
		
		jindo.name = "백구";
		
		jindo.bark();
	}
}










