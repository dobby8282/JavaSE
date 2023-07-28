package section09;

/*
 * 생성자(Constructor)
 * 	객체를 생성할때 실행되는 반환값 없는 메서드
 *	객체 초기화 목적에 주로 사용한다.
 *	클래스명과 동일하다. 
 * 
 */

public class Constructor01 {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "이방인";
		book1.price = 9000;
		book1.totalPage = 280;
		book1.author = "알베르 카뮈";
		
		book1.getInfo();
		System.out.println("================");
		
		Book book2 = new Book();
		book2.getInfo();
		
		
	}		
}







