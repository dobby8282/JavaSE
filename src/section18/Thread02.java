package section18;

import section18.access1.CountThread;

public class Thread02 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		CountThread cThread = new CountThread();
		cThread.start();
		
		System.out.println("메인스레드 종료!");
	}

}
