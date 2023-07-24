package section05;

/*
5번 구구단										i
	 2 x 1 = 2 	3 x 1 = 3	4 x 1 = 4		0
	 2 x 2 = 2 	3 x 1 = 3	4 x 1 = 4		1
	 2 x 3 = 2 	3 x 1 = 3	4 x 1 = 4		2
	 2 x 4 = 2 	3 x 1 = 3	4 x 1 = 4		3
	 2 x 5 = 2 	3 x 1 = 3	4 x 1 = 4		4
	 2 x 6 = 2 	3 x 1 = 3	4 x 1 = 4		5
	 2 x 7 = 2 	3 x 1 = 3	4 x 1 = 4		6
	 2 x 8 = 2 	3 x 1 = 3	4 x 1 = 4		7
	 2 x 9 = 18 3 x 1 = 3	4 x 1 = 4		8

 */

public class LoopHomeWork2 {
	public static void main(String[] args) {
		for(int k = 0; k < 3; k++) {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 3; j++) {
					int dan = (j+2)+(k*3);
					if(dan > 9) break;
					System.out.printf("%d X %d = %d\t",  dan, i+1, dan*(i+1));
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
