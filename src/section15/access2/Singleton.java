package section15.access2;

public class Singleton {
	// 정적변수로 인스턴스 저장
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

}
