package section09;

public class Constructor03 {
	public static void main(String[] args) {
		AniCharacter ac1 = new AniCharacter();
		
		ac1.getInfo();
		
		System.out.println("========================");
		
		String[] items = {"고길동"};		
		AniCharacter ac2 = new AniCharacter(
				"둘리",
				"아기공룡 둘리",
				"198407",
				"ENFP",
				items
				);
		
		ac2.getInfo();
		
		System.out.println("========================");
		
		String[] friends = {"진구", "이슬이", "퉁퉁이", "비실이"};
		AniCharacter ani3 = new AniCharacter(friends);
		
	}

}



