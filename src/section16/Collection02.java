package section16;

import java.util.ArrayList;
import java.util.List;

/*
 * List
 * 	컬렉션 프레임웍 중 하나 인터페이스로 순서가 있는 데이터 모음을 다루는 객체
 * 	선형 배열 객체
 * 	가변 배열 객체
 * 	인덱스 값이 있다.
 */
public class Collection02 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		// 데이터 저장하기		// 인덱스번호
		list.add("피카츄");	// 0
		list.add("라이츄");	// 1
		list.add("파이리");	// 2
		list.add("꼬부기");	// 3
		list.add("버터플");	// 4
		list.add("야도란");	// 5
		list.add("피존투");	// 6
		list.add("또가스");	// 7
		
		// 저장된 데이터 특정 인덱스 값으로 얻어오기
		String pokemon = list.get(6);
		System.out.println("list 6 인덱스 값: " + pokemon);
		
	}

}









