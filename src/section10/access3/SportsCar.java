package section10.access3;

import section10.access2.Car;

public class SportsCar extends Car {
	public boolean isOpen;
	
	@Override
	public void getInfo() {
		System.out.println("Model: " + model);
		// protected 상속관계 접근 가능
		System.out.println("Color: " + color); 
//		System.out.println("Year: " + year);
//		System.out.println("Brand: " + brand);
		System.out.println("Open: " + isOpen);
	}
	

}
