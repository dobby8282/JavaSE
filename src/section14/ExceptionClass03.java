package section14;

/*
 * finally 키워드
 * 	예외 발생 여부와 관계없이 항상실행되는 코드영역
 * 
 */

public class ExceptionClass03 {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		
		try {
			
			System.out.println("DB를 연결합니다.");
			
			result = num1 / num2;
			System.out.println("result: " + result);
			
		} catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
		} finally {
			System.out.println("DB 연결 해제합니다.");
		}
	}
}







