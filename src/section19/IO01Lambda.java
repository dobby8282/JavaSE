package section19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * I/O(Input/Output)
 * 	데이터를 읽고 쓰는 작업을 의미한다.
 * 	자바에서 java.io 패키지를 통해 프로그래밍 할 수 있다.
 * 
 * 
 * File Class
 * 	경로 정보를 받아 파일 또는 디렉토리 정보를 객체화
 * 
 * 
 */
public class IO01Lambda {
	
	public static void main(String[] args) {
		// File 객체 생성
		File f = new File("C:\\"); // \\ -> \
		
		// C 드라이브 하위에 있는 모든 디렉토리 및 파일 리스트 반환
		String[] list = f.list();
		
//		List files = Arrays.asList(list);	// Java8 이하버전
		List files = List.of(list);
		
		List<File> fileList = 
				(List<File>) files.stream()
			.map(e -> new File(f, (String) e))
			.collect(Collectors.toList());
		
		Stream<File> fileStream = fileList.stream();
		
		fileStream.forEach(file -> {
			System.out.println(file.getName());
		});
		
	}
}










