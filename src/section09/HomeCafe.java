package section09;

public class HomeCafe {
	public String drink;
	public int price;
	public String type;
	
	// static 초기화 블럭
	static {
		System.out.println("HomeCafe() static 초기화 블럭 입니다.");
	}
	
	// 초기화 블럭
	{
		this.drink = "아메리카노";
		this.price = 4000;
		this.type = "Coffee";
		
		System.out.println("HomeCafe() 초기화 블럭 입니다.");
	}
	
	public HomeCafe() {
		System.out.println("HomeCafe() 생성자 입니다.");
	}
	
//	public HomeCafe() {
//		this.drink = "아메리카노";
//		this.price = 4000;
//		this.type = "Coffee";
//	}
	
	public void getInfo() {
		System.out.println("drink: " + drink);
		System.out.println("price: " + price);
		System.out.println("type: " + type);
	}
}







