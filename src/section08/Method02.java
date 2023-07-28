package section08;

public class Method02 {
	public static void main(String[] args) {
		
		String name = getName();
		
		System.out.println("name: " + name);
		
		System.out.println("getName(): " + getName());
		
		
		
	}
	
	// 6. 인자 x 리턴 o -> 메서드 실행하여 값 반환
	public static String getName() {
		String name = "피카츄";
		
		return name;
	}

}



