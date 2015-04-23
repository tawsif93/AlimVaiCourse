package org.iit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Number> s=new Stack<>();
		
		double i;
		s.push(1.00);
		
		i=(Double) s.pop();
		
		Set<String> set=new TreeSet<>();	
		
		set.add("apple");
		set.add("orange");
		set.add("banana");
		
		for (String string : set) {
			
			System.out.println(string);
		}
		
		
		
		Map<String, Integer> map=new HashMap<>();
		
		
		map.put("red", 1);

		map.put("black", 1);
		map.put("green", 5);
		
		
		TreeSet< String> ts=new TreeSet<>(map.keySet());
		
		
		for (String string : ts) {
			
			System.out.println(string+": "+ map.get(string));
		}
		
		System.out.println(map.get("black"));
		
		Integer a=map.get("black");
		
		map.put("black", ++a);
		
		System.out.println(map.get("black"));

			

		for (Map.Entry<String, Integer> m:map.entrySet()) {
			
		//	System.out.println(m.getKey()+": "+ m.getValue());

			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
