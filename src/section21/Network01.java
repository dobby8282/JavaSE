package section21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network01 {
	public static void main(String[] args) throws UnknownHostException {
		
		// InetAddress는 IP를 관리하는 클래스
		// getLocalHost() 로컬 시스템의 IP를 InetAddress 객체로 반환
		InetAddress ia = InetAddress.getLocalHost();
		
		// getHostName() 는 호스트 이름을 반화
		System.out.println("host name: " + ia.getHostName());
		
		// getHostAddress() 는 호스트 IP를 반환
		System.out.println("host ip: " + ia.getHostAddress());
		
		// getByName()는 특정사이트의 IP를 InetAddress로 반환
		ia = InetAddress.getByName("www.naver.com");
		
		System.out.println("host name: " + ia.getHostName());
		System.out.println("host ip: " + ia.getHostAddress());
		
	}
}







