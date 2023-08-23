package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상 클래스이다.
 * 
 * FileInputStream
 * 	파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 	파일을 바이트 단위로 순차적으로 쓰는 객체
 * 
 */
public class IO04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			// ./upload/hello.txt 파일읽을수 있는 객체 생성
			fis = new FileInputStream("./upload/hello.txt");
			
//			// upload2 디렉토리생성
			File f1 = new File("./upload2");
			if(f1.mkdir()) {
				System.out.println("upload2 디렉토리가 생성되었습니다.");
			}
//			
//			// hello2.txt 파일생성
//			File f2 = new File(f1, "hello2.txt");
//			if(f2.createNewFile()) {
//				System.out.println("hello2.txt 파일이 생성되었습니다.");
//			}
			
			// hello2.txt 에 쓰기 준비 객체생성
			// 파일이 존재하지 않으면 자동으로 생성해준다. (폴더생성 X)
			fos = new FileOutputStream("./upload2/hello2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];	
			
			while((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("파일 복사 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}




