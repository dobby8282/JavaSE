package section21;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// https://mvnrepository.com/artifact/org.jsoup/jsoup/1.16.1

public class Network04 {
	public static void main(String[] args) throws IOException {
		String url = "https://music.bugs.co.kr/chart";
		
		Document doc = Jsoup.connect(url).get();
		
		Elements musicList = doc.select("p.title");
		Elements artistList = doc.select("p.artist");
		
		for(int i = 0; i < musicList.size(); i++) {
			System.out.print((i+1) + " ");
			System.out.print(musicList.get(i).text().trim() + "-");
			System.out.println(artistList.get(i).select("a").get(0).text().trim());
		}
	}
}






