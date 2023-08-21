package section18;

/*
 * 스레드(Thread)
 * 	스레드는 프로그램 내에서 실행되는 프로그램 제어 흐름(실행단위)을 말한다.
 * 	하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업단위
 * 	병렬 프로그래밍
 * 	비동기 프로그래밍
 * 
 * 스레드 실행방법
 * 	1. Thread 클래스 상속
 * 	2. run() 메서드 오버라이딩 구현
 * 	3. 1번 Thread 상속받은 클래스 생성
 * 	4. start() 메서드 호출로 실행!
 * 
 */

public class Thread01 {
	
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		MyThread thread1 = new MyThread();
		thread1.start();
		
		System.out.println("메인 스레드 종료!");
	}

}











