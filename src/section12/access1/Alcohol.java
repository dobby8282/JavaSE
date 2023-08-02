package section12.access1;

// 추상클래스
public abstract class Alcohol {
	// 속성
	public String name;
	public int proof;
	public int price;
	
	protected String taste;
	
	// 구현되지 않은 추상메서드
	public abstract void setTaste(String taste);
	
	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("proof: " + proof);
		System.out.println("price: " + price);
		System.out.println("taste: " + taste);
	}
	
	

}
