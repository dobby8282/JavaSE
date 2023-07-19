package section05;
/*
 * 3. for 문
 * 	초기식, 조건식, 증감식을 이용하여 반복적으로 실행하는 명령어
 * 
 * 	for(초기식; 조건식; 증감식) {
 * 		반복 수행할 코드
 * 	}
 * 
 */
public class Loop03 {
	public static void main(String[] args) {
		// for문을 이용하여 0~9까지 출력
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		int i = 0;	// 초기식
		while(i < 10) {	// 조건식
			System.out.println(i);
			i++;	// 증감식
		}
		
		
	}
}






