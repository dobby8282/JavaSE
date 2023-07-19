package section05;
/*
 * 중첩 for문
 * 	for문 안에 for문
 * 
 * 
 * 

*
**
***
****
*****
******
*******



 */

public class Loop04 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}







