package kro.ex01;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Long> hm = new HashMap<>();
		
		hm.put("A", (long) 99887766);
		hm.put("B", (long) 99887767);
		hm.put("A", (long) 99887768);
		
		System.out.println(hm.containsKey("A"));
		
		System.out.println(hm.get("A"));
		
		hm.remove("C");
		

	}

}
