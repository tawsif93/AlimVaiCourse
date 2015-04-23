package org.iit.firstdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {

	public static void main(String[] args) {

		SimpleArray s = new SimpleArray(6);

		ExecutorService e = Executors.newCachedThreadPool();

		ArrayWriter a1 = new ArrayWriter(s, 1);
		ArrayWriter a2 = new ArrayWriter(s, 10);

		e.execute(a1);
		e.execute(a2);

		e.shutdown();

		boolean end = false;
		try {
			end = e.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		if (end) {
			System.out.println(s);

		}

	}

}
