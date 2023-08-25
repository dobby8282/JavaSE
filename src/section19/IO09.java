package section19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import section19.access1.PokemonVO;

public class IO09 {
	public static void main(String[] args) {
		
		String filePath = "./upload/pokemon.obj";
		
		try (
				FileInputStream fis = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fis);
			) {
			
			PokemonVO pokemon = (PokemonVO) ois.readObject();
			System.out.println("pokemon.obj 파일 >> 객체화");
			System.out.println("No." + pokemon.getNo());
			System.out.println("Name: " + pokemon.getName());
			System.out.println("Type: " + pokemon.getType());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}



