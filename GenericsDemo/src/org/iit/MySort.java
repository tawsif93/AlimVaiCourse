package org.iit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] c = { "Red", "Green", "Blue", "Yellow" };

		List<String> colorBannk = new ArrayList<>();

		for (String s : c)
			colorBannk.add(s);
		
		System.out.println(colorBannk);
		
		
		
		Collections.sort(colorBannk, Collections.reverseOrder());
		
		System.out.println(colorBannk);
		
		
		
		
		
		
		
		
		
		
		
	}

}
