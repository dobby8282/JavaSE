package section13;

import section13.access2.Bird;

public class OuterClass06 {
	
	public static void main(String[] args) {
		
		String name = new Bird() {
			
			private String name = "비둘기";
			
			@Override
			public void sing() {
				System.out.println("노래를 해요~");
			}
			
			@Override
			public void fly() {
				System.out.println("하늘을 날아요~");
			}
			
			public String getName() {
				return name;
			}
			
		}.getName();
		
		System.out.println("name: " + name);
		
	}

}


