package section21;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * [[ URL(Uniform Resource Locator) ]]
 * 	인터넷에서 웹 페이지, 이미지, 동영상 등과 같은 리소스를 찾을 수 있는 주소
 * 
 *  https://n.news.naver.com:443/article/020/0003493846?ntype=RANKING
 * 
 * 	프로토콜(protocol)
 * 		컴퓨터 네트워크를 통해 통신을 수행하기 위한 표준 규칙, 절차, 혹은 통신 프로세스를 의미
 * 		ex) http/https - 웹서버 프로토콜
 * 			ftp - 파일서버 프로토콜
 * 			mailto - 전자메일 서버 프로토콜
 * 			telnet - 원격지 접속 프로토콜
 * 
 * 	호스트(host)
 * 		리소스가 위치한 서버의 이름
 * 		ex) n.news.naver.com
 * 	
 * 	포트(port)
 * 		서버에서 사용하는 서비스나 응용프로그램에 할당된 번호
 * 		ex) 80(http default) 443(https default)
 * 
 * 	경로(path) 
 * 		웹 서버에서 자원에 대한 경로(물리적 또는 추상적 경로)
 * 		ex)/article/020/0003493846
 * 			/경로1/경로2/페이지이름.html
 * 			/upload/2023/4/14/upload_2023414887
 * 
 * 	쿼리(query)
 * 		추가로 서버에 보내는 파라미터 (물음표 뒤) 
 *      ?ntype=RANKING
 *      ?key1=value1&key2=value2....&keyN=valueN
 * 
 * 	레퍼런스(reference)
 * 		웹페이지 내의 특정 섹션 또는 문서 특정위치
 * 		ex) #body
 * 
 * [[ URL Class ]]
 * 	URL 클래를 사용하여 웹페이지 리소스, 이미지, 동영상, REST API 등 데이터를 가져올 수 있다. 
 */
public class Network02 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://n.news.naver.com:443/article/020/0003493846?ntype=RANKING#body");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String refrence = url.getRef();
		
		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("port : " + port);
		System.out.println("path : " + path);
		System.out.println("query : " + query);
		System.out.println("refrence : " + refrence);
		
		
		
		
	}

}
