package review.test2;

import review.Test;

public class Test2 extends Test implements testInterface {
	
	@Override
	public void testInterMethod() {
		System.out.println("인터페이스 메소드");
		
	}

	String name;
	
	@Override
	public void test() {
		System.out.println("protected 테스트중입니다.");
	}
	
	public Test2() {
		
		this.name = super.testMember;
		
		System.out.println("생성자 입니다.");
	}
	
	public Test2(String name) {
		this.name = name;
		
	}
	
	static void test2() {
		System.out.println("test2 protected 테스트중입니다.");
	}


}
