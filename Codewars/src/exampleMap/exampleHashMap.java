package exampleMap;

import java.util.HashMap;
import java.util.Map;

public class exampleHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> hashFamily = new HashMap<Integer, String>();
		hashFamily.put(0, "Vadim");
		hashFamily.put(1, "Ira");
		hashFamily.put(2, "Misha");
		hashFamily.put(3, "Anna");
		
		System.out.println(hashFamily.get(2));
		
		hashFamily.put(2, "Mihail");
		
		System.out.println(hashFamily.get(2));
	}

}
