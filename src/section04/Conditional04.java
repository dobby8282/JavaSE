package section04;
/*
 * 2. switch ~ case 문
 * 	주어진 변수 값에 따라 여러개 case로 분기 실행 명령어
 */
public class Conditional04 {
	public static void main(String[] args) {
		char key = 's';
		
		switch(key) {
		case 'w':
			System.out.println("앞으로 이동");
			break;
		case 'a':
			System.out.println("좌측으로 이동");
			break;
		case 's':
			System.out.println("뒤로 이동");
			break;
		case 'd':
			System.out.println("우측으로 이동");
			break;
		default:
			System.out.println("Hold!");
			break;
		}
	}

}



