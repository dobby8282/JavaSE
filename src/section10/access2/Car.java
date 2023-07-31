package section10.access2;

public class Car {
	public String model;
	protected String color;
	int year;
	private String brand;
	
	public void getInfo() {
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
		System.out.println("Brand: " + brand);
	}

}
