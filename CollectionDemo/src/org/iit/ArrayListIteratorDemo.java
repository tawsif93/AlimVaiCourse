package org.iit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {

		String[] c = { "Red", "Green", "Blue", "Yellow" };

		List<String> colorBannk = new ArrayList<>();

		for (String s : c)
			colorBannk.add(s);

		String[] r = { "Red", "Green" };

		List<String> removeColorList = new ArrayList<>();

		for (String s : r)
			removeColorList.add(s);

		System.out.println("Before:");
		
		for (int i = 0; i < colorBannk.size(); i++) {

			System.out.println(colorBannk.get(i));

		}

		removeColor(colorBannk, removeColorList);

		System.out.println("After:");
		for (int i = 0; i < colorBannk.size(); i++) {

			System.out.println(colorBannk.get(i));

		}

	}

	static void removeColor(List<String> l1, List<String> l2) {

		Iterator<String> it = l1.iterator();

		while (it.hasNext()) {

			if (l2.contains(it.next())) {

				it.remove();
			}

		}

	}

}
