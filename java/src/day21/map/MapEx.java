package day21.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class MapEx {

	public static void main(String[] args) {
		//Map을 배열처럼 사용하는 예제 정수 배열/정수 리스트
		HashMap<Integer, Integer> map = new HashMap<>();
		//배열 0번지에 1, 1번지에 2, .... 4번지에 5를 저장
		for(int i = 0; i < 5; i++) {
			map.put(i, i+1);
		}
		System.out.println(map);
		
		//아이디, 비밀번호를 관리하는 예제
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("ABC123", "1234");
		map2.put("QWE123", "4321");
		map2.put("ABC123", "QAZ"); //key값이 중복된 정보를 추가
		map2.put("zxc", "QAZ"); //
		System.out.println(map2);
		
		//ketSet을 이용한 반복문. key값들을 Set으로 만들어서 반복
		HashSet<String> keySet = (HashSet<String>)map2.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String id = it.next();//key값을 가져옴
			String pw = map2.get(id);//key값(id)를 이용해서 value값을 가져옴
			System.out.println("id : " + id + ", pw : " + pw);
		}
		//
		Set<Entry<String, String>> entrySet = map2.entrySet();
		
		Iterator<Entry<String, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, String> tmp = it2.next();
			String id = tmp.getKey();
			String pw = tmp.getValue();
			System.out.println("id : " + id + ", pw : " + pw);
		}
	}
}

	
	
	