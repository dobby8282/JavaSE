package section15;

import java.util.Random;

public class JavaUtil02 {
	
	public static void main(String[] args) {
		
		// int 45크기 배열생성
		int[] lNum = new int[45];
		
		// 1부터 45까지 배열에 저장
		for(int i = 0; i < lNum.length; i++) {
			lNum[i] = i + 1;
		}
		
		Random ran = new Random();
		
		for (int i = 0; i < lNum.length; i++) {
			// 0 ~ 44 까지 숫자중 임의 값 반환
			int changeIndex = ran.nextInt(45);
			
			int tmp = lNum[i];
			lNum[i] = lNum[changeIndex];
			lNum[changeIndex] = tmp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lNum[i]+ "/");
		}
		
	}

}






