package section18;

import section18.access3.InterThread;

public class Thread05 {
	
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		Runnable interThread = new InterThread();
		Thread thread = new Thread(interThread);
		
		thread.start();
		
		System.out.println("메인스레드 종료!");
	}

}
