package section16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * 	Map 인터페이스는 키-값 쌍으로 데이터를 저장하는 자료구조이다.
 * 	키는 중복을 허용하지 않는다.
 * 
 */
public class Collection04 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 저장하기
		map.put("Alice", 95);
		map.put("Bob", 82);
		map.put("David", 91);
		map.put("Son", 100);
		
		// map 값 가져오기
		int score = map.get("Alice");
		System.out.println("Alice Score: " + score);
		
		// 특정 키의 존재여부 확인
		if(map.containsKey("Son")) { 
			System.out.println("Son Score: " + map.get("Son"));
		}
		
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print("name: " + name+", ");
			System.out.println("score: " + map.get(name));
		}
		
		System.out.println("========================================");
		
		// entrySet() 메서드를 사용하여 키-값 쌍으로 가져오기
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.print("Name: " + entry.getKey()+", ");
			System.out.println("Score: " + entry.getValue());
		}
		
		
		System.out.println("map 길이 : " + map.size());
		
		
		// 키값을 통해 특정 데이터 삭제
		map.remove("Bob");
		
		
		// 데이터 전체 삭제 
		map.clear();
		
		// Map이 비어있는지 확인
		if(map.isEmpty()) {
			System.out.println("Map is empty!");
		}
		
		
	}

}






