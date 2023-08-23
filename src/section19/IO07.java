package section19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * try-with-resources
 * 	try 코드 블록이 끝나면 자동으로  resources를 close 해주는 기능
 * 
 *  AutoCloseable 상속받은 클래스만 가능!
 * 
 */

public class IO07 {
	public static void main(String[] args) {
		
		try(
				FileInputStream fis = new FileInputStream("./upload/hello.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream("./upload2/hello5.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				PrintStream ps = new PrintStream(bos, true);
			) {

			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush(); // 버퍼에 남은 데이터 파일에 쓰고 버퍼를 비움
			
			ps.println();
			ps.println("=========================");
			ps.println("PrintStream Test ...");
			ps.println("프린트 스트림 println 메서드!");
			ps.println("=========================");
			
			System.out.println("파일 복사 완료!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
