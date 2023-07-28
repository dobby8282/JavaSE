package section09;

public class Ani {
	public String title;
	public String genre;
	public int runTime;
	public boolean isAdult;
	
	public Ani(
			String title, 
			String genre, 
			int runTime, 
			boolean isAdult
			) {
		this.title = title;
		this.genre = genre;
		this.runTime = runTime;
		this.isAdult = isAdult;
	}
	
	public void getInfo() {
		System.out.println("title: " + title);
		System.out.println("genre: " + genre);
		System.out.println("runTime: " + runTime);
		System.out.println("isAdult: " + isAdult);
	}

}
