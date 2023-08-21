package section18.access2;

public class Sister extends Thread {

	public Wallet wallet;
	public int money;
	
	public Sister(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) {
			int returnMoney = wallet.getMoney();
			if(returnMoney == 0) {
				break;
			}
			
			money += returnMoney;
			
			System.out.println("Sister 총 재산: " + money);
			
		}
	}

}
