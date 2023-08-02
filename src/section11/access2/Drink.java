package section11.access2;

public class Drink {
	public String name;
	public String volume;
	public String type;
	public int price;
	public double discountRate;
	
	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("volume: " + volume);
		System.out.println("type: " + type);
		System.out.println("price: " + price);
		System.out.println("discountRate: " + discountRate);
	}
	
	public void getDiscountRate() {
		if(discountRate == 0.333) {
			System.out.println("2+1 할인 행사중 입니다.");
		} else if (discountRate == 0.5) {
			System.out.println("1+1 할인 행사중 입니다.");
		} else {
			System.out.println("행사 상품이 아닙니다.");
		}
		
	}
	

}
