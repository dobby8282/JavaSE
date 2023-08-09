package section15;

/*
 * StringBuffer
 * 	문자열을 동적으로 다루기위한 클래스
 * 	Thread Safe O
 * 
 * 
 * StringBuilder
 * 	문자열을 동적으로 다루기위한 클래스
 * 	Thread Safe X
 * 
 * 
 */

public class JavaLang04 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("안녕하세요. ");
		System.out.println(System.identityHashCode(sBuilder));
		sBuilder.append("Hello Java");
		System.out.println(System.identityHashCode(sBuilder));

		System.out.println(sBuilder);
		
		
	}

}





