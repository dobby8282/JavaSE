package section16;
/*
 * 제네릭(Generic)
 * 	코드의 재사용성과 타입 안정성을 높이기 위해 도입된 기능
 * 	클래스나 메서드를 일반적인 타입 대신에 실제타입으로 지정할수 있게 한다.
 * 
 * 	1. 잘못된 타입의 값이 들어오는것을 방지할수 있다.
 * 	2. 강제 형변환(cast) 필요없이 사용가능하다.
 * 
 * 
 */

public class Generic {
	public static void main(String[] args) {
		
		MyClass<String> mc1 = new MyClass<String>();
		mc1.setData("Hello, Generic!");
		
		String data = mc1.getData();
		System.out.println(data);
		
		MyClass mc2 = new MyClass<>();
		mc2.setData("Nice to meet you!");
		
		String data2 = (String) mc2.getData();
		System.out.println(data2);
		
	}

}









