package org.iit.firstdemo;

import java.util.Arrays;
import java.util.Random;

public class SimpleArray {

	final int[] a;
	int writeIndex = 0;
	static final Random r = new Random();

	public SimpleArray(int size) {

		a = new int[size];

	}

	public synchronized void add(int value) {

		int position = writeIndex;

		try {
			Thread.sleep(r.nextInt(500));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a[position] = value;

		writeIndex++;
		System.out.println(Thread.currentThread().getName() + "  wrote "
				+ value + " in position " + position);

		System.out.println("Next write position " + writeIndex);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Content of Array: " + Arrays.toString(a);
	}

}
