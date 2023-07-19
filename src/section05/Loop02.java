package section05;
/*
 * 2. do ~ while 문
 * 	while 문과 비슷하지만, 최소 한번 실행된다.
 * 
 * 	do {
 * 
 * 	} while(조건식);
 * 
 */
public class Loop02 {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
		} while (count < 100);
	}
}





