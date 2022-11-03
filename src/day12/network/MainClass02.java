package day12.network;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass02 {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://finance.naver.com/news/news_read.naver?mode=mainnews&office_id=008&article_id=0004813843");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		String query = url.getQuery();
		
		
		System.out.println("protocol : "+ protocol);
		System.out.println("host : "+ host);
		System.out.println("query : "+ query);
	}

}
