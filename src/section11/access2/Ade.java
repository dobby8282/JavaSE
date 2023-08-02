package section11.access2;

public class Ade extends Drink {
	
	private boolean isZero;
	
	public Ade() {
		name = "코카콜라";
		volume = "355ml";
		type = "Ade";
		price = 1900;
		discountRate = 0.333;
		isZero = true;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("isZero: " + isZero);
	}

	public boolean isZero() {
		return isZero;
	}

	public void setZero(boolean isZero) {
		this.isZero = isZero;
	}

}
