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
	

}
