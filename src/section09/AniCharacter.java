package section09;

public class AniCharacter {
	// 속성
	public String name;
	public String aniTitle;
	public String birth;
	public String mbti;
	public String[] items;
	
	public AniCharacter() {
		this.name = "도라에몽";
		this.aniTitle = "도라에몽";
		this.birth = "197304";
		this.mbti = "ESFJ";
		String[] items = {"대나무헬리콥터", "어디로든문"};
		this.items = items;
	}
	
	// 생성자 오버로딩
	public AniCharacter(
			String name,
			String aniTitle,
			String birth,
			String mbti,
			String[] items
			) {
		this.name = name;
		this.aniTitle = aniTitle;
		this.birth = birth;
		this.mbti = mbti;
		this.items = items;
	}
	
	public AniCharacter(String[] friends) {
		this();	// 제일 위에 선언
		getInfo();
		System.out.println(">>친구목록<<");
		for(String friend:  friends) {
			System.out.print(friend+ " ");
		}
	}
	
	
	
	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("aniTitle: " + aniTitle);
		System.out.println("birth: " + birth);
		System.out.println("mbti: " + mbti);
		
		for(int i = 0; i < items.length; i++) {
			System.out.println("items["+i+"]: " + items[i]);
		}
		
		
	}
	
	
	
}
