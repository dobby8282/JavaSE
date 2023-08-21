package section18.access2;

public class Wallet {
	
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
	public int getMoney() {
		if(totalMoney == 0) {
			return 0;
		}
		
		totalMoney -= 1;
		
		return 1;
	}

}







