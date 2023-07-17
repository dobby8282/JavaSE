package section02;
/*
 * 3. 정수형 
 * 	byte	(1byte)	: -128 ~ +127 
 * 	short	(2byte) : -32,768 ~ +32,767
 * 	int		(4byte) : -2,147,483,648 ~ +2,147,483,647
 * 	long	(8byte) : -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
 * 
 */
public class Variable03 {
	public static void main(String[] args) {
		// 정수형 변수 선언과 동시에 값 대입하기
		byte nByte = 10;
		short nShort = 100;
		int nInt = 1000;
		long nLong = 10000;
		
		System.out.println("byte 형: " + nByte);	// 문자 + 숫자 => 문자
		System.out.println("short 형: " + nShort);
		System.out.println("int 형: " + nInt);
		System.out.println("long 형: " + nLong);
		
		nByte += 120; 	// nByte = nByte + 120;
		System.out.println("byte overflow: " + nByte);
		
		
		
	}

}







