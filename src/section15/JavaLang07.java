package section15;
/*
 * String 메서드
 * 
 */

public class JavaLang07 {
	
	public static void main(String[] args) {
	
		// 문자열 길이 length
		String txt = "ABCDEFGHIJK";
		System.out.println("length: " + txt.length());
		
		// 문자열이 지정한 문자로 시작하는지 판단
		String str1 = "apple";
		boolean startWith = str1.startsWith("a");
		System.out.println("startWith: " + startWith);
		
		// 문자열 마지막에 지정한 문자가 있는지 판단
		String str2 = "text";
		boolean endWith = str2.endsWith("t");
		System.out.println("endsWith: " + endWith);

		// 문자 인덱스번호 반환
		String str3 = "abcdef";
		int indexOf = str3.indexOf("d");
		System.out.println("indexOf: " + indexOf);
		
		// 문자열에 지정한 문자가 마지막 몇번째 있는지 int로 반환
		String str4 = "AndroidApp";
		int lastIndexOf = str4.lastIndexOf("A");
		System.out.println("lastIndexOf: " + lastIndexOf);
		
		// 문자 치환
		String str5 = "A*B*C*D";
		String replace = str5.replace("*", "-");
		System.out.println("replace: " + replace);
		
		// 문자열 나누기 배열로 반환
		String str6 = "A:B:C:D:E:F:G:abcdefg";
		String[] splits = str6.split(":");
		for(String split : splits) {
			System.out.println(split);
		}
		
		// 문자열 절삭
		String str7 = "ABCDEF";
		String substring = str7.substring(0, 2);
		System.out.println("substring: " + substring);
		
		// 소문자 변환
		String str8 ="abcDEF";
		String toLowerCase = str8.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
		
		// 대문자 변환
		String str9 = "abcDEF";
		String toUpperCase = str9.toUpperCase();
		System.out.println("toUpperCase: " + toUpperCase);
		
		// 공백제거
		String str10 = "    java java java    ";
		String trim = str10.trim();
		System.out.println("trim: " + trim);
		
		// 공백제거2
		String str11 = "    java java java    ";
		String replace2 = str11.replace(" ", "");
		System.out.println("replace2: " + replace2);
		
		// 문자비교
		String str12 = "A";
		String str13 = "B";
		int compareTo = str12.compareTo(str13);
		System.out.println("compareTo: " + compareTo);
		
		// 문자 포함여부
		String str14 = "abcd";
		String str15 = "cd";
		boolean contains = str14.contains(str15);
		System.out.println("contains: " + contains);
		
	}
	
}






