package section21.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket s = null;
		InputStream in = null;
		OutputStream out = null;
		
		try {
			// 3000번 port로 ServerSocket 객체 생성
			serverSocket = new ServerSocket(3000);
			
			System.out.println("클라이언트 요청 대기중 ...");
			
			// accept() 메소드 클라이언트 요청이 들어오면
			// 클라이언트와 통신 할 수 있는 Socket 객체를 생성한다.
			s = serverSocket.accept();
			
			System.out.println("클라이언트 요청 수락 ...");
			
			// Socket 객체를 이용해서 InputStream 객체 생성한다.
			in = s.getInputStream();
			byte[] b = new byte[1024];
			
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b, 0, readByteCnt));
			
			// 응답 데이터 돌려주기
			out = s.getOutputStream();
			out.write(b, 0, readByteCnt);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null) out.close();
			if(in != null) in.close();
			if(s != null) s.close();
			if(serverSocket != null) serverSocket.close();
		}
	}
}




