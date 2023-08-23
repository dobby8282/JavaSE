package section19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * BufferedInputStream / BufferedOutputStream
 * 	자바에서 성능을 향상시켜주기 위한 I/O 보조 스트림 
 * 
 */

public class IO05 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		PrintStream ps = null;
		
		try {

			fis = new FileInputStream("./upload/hello.txt");
			// 기존 스트림을 감싸서 버퍼에 저장
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("./upload2/hello3.txt");
			// 기존 스트림 감싸서 버퍼에 저장
			bos = new BufferedOutputStream(fos);
			
			ps = new PrintStream(bos, true);
			
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
		} finally {
			
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
			}
			
		}
	}
}








