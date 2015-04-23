package org.iit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <MyTime> t=new ArrayList<>();
		
		t.add(new MyTime(10, 55, 14));
		t.add(new MyTime(10, 55, 42));
		t.add(new MyTime(1, 12, 43));
		t.add(new MyTime(13, 20, 25));
		
		System.out.println(t);
		
		Collections.sort(t, new MyComparator());
		
		System.out.println(t);
		
		
		
	}

}
