package com.chig.collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put(1, "tony");
		map.put(4, "ranjith");
		map.put(3, "amulya");
		map.put(10, "raji");
		map.put("ranjith", "tony");
		map.put("amulya", "chig");
		
		
		
		//System.out.println(map);
		
		for(Object key : map.keySet()) {
			Object value = map.get(key);
			System.out.println(key + "=" + value);
		}
		
		for(Object value : map.values()) {
			System.out.println(value);
		}
		
		for(Object set :  map.entrySet()) {
			Entry entry = (Entry) set;
			System.out.println(entry.getKey()  + "=" + entry.getValue());
		}
	}

}
