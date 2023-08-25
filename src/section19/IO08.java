package section19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import section19.access1.PokemonVO;

/*
 * ObjectInputStream / ObjectOutputStream
 * 	객체를 바이트 스트림으로 읽고 쓰는 클래스
 * 
 * Serializable
 * 	직렬화하기위한 인터페이스, 객체를 일련의 바이트(byte)로 변환하는 것
 * 
 * 
 */
public class IO08 {
	public static void main(String[] args) {
		
		PokemonVO pokemon = new PokemonVO();
		
		pokemon.setNo("025");
		pokemon.setName("피카츄");
		pokemon.setType("전기");
		
		
		String filePath = "./upload/pokemon.obj";
		
		try(
				FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			
			oos.writeObject(pokemon);
			
			System.out.println("pokemon 객체를 pokemon.obj 파일로 백업");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

				
		
	}

}













