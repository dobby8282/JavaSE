package section18;

import section18.access1.CountThread;

public class Thread03 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		CountThread cThread = new CountThread();
		cThread.setName("CountThread");
		cThread.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread().getName()+"-");
			System.out.println(i*100);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			
		}
		
		
		System.out.println("메인스레드 종료!");
	}

}
