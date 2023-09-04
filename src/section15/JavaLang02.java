package section15;
/*
 * 1. 얕은복사(Shallow Copy)
 * 	- 참조형 변수에 주소값만 복사
 * 	- 동일한 객체를 참조하게 된다.
 * 
 * 2. 깊은복사(Deep Copy)
 * 	- 객체의 멤버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식.
 * 	- 새로운(다른) 객체를 참조하게 된다.
 * 
 */

import section15.access1.Soccer;

public class JavaLang02 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Soccer soccer1 = new Soccer("리버풀", "리버풀", 1892, "프리미어리그");
		Soccer soccer2 = soccer1;
		
		Soccer soccer3 = (Soccer)soccer1.callClone();
		
		soccer2.team = "리버풀 FC";
		
		
		if(soccer1.equals(soccer2)) {		// 같다
			System.out.println("soccer1 과 soccer2는 같다.");
		} else {
			System.out.println("soccer1 과 soccer2는 다르다.");
		}
		
		if(soccer1.equals(soccer3)) {		// 다르다
			System.out.println("soccer1 과 soccer3는 같다.");
		} else {
			System.out.println("soccer1 과 soccer3는 다르다.");
		}
		
		System.out.println(System.identityHashCode(soccer1));
		System.out.println(System.identityHashCode(soccer2));
		System.out.println(System.identityHashCode(soccer3));
		
		System.out.println(soccer1);
		System.out.println(soccer2);
		System.out.println(soccer3);
		
	}

}











