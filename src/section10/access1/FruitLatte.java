package section10.access1;

public class FruitLatte extends Latte{
	public String fruit;
	public String origin;
	
	@Override		// 어노테이션 - 클래스, 메서드, 필드 등 추가적인 메타정보 제공
	public void getInfo() {
		super.getInfo();
		System.out.println("Fruit: " + fruit);
		System.out.println("Origin: " + origin);
	}
	
}
