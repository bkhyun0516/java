package collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx1 {

	public static void main(String[] args) {
		/*
		 * 
		 * Map은 key와 value로 구성
		 * (자바스크립트의 객체와 비슷하다.)
		 *  key 중복 허용 X  value 중복 허용 O 
		 */
		Map person  = new ConcurrentHashMap();
		person.put("name","황정민");
		person.put("name","이정재");
		person.put("height", 180);
		person.put("weight", 90);
		person.put("weight", 78);
		person.put("salary", 78);
		
		
		
		
		
		
		System.out.println(person);
	}//main() end

}
