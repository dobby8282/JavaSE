package section21.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		OutputStream out = null;
		InputStream in = null;
		
		try {
			
			// 서버 3000 port로 접속
			socket = new Socket("localhost",3000);
			
			// OutputStream을 통해 서버에 데이터 전송(요청)
			out = socket.getOutputStream();
			out.write("Hello, Socket!".getBytes());
			
			// 서버에서 보내온 데이터 읽어오기
			in = socket.getInputStream();
			byte[] b = new byte[1024];
			
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b, 0, readByteCnt));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
			if(socket != null) socket.close();
			
		}
		
	}

}
