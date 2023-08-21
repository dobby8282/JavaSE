package section18;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("MyThread 시작!");
		
		try {
			Thread.sleep(2000);	// 밀리세컨즈 2초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread 종료!");
	}

}
