package org.iit.firstdemo;

import java.util.Random;

public class Producer implements Runnable {

	final Buffer sharedLocation;
	final Random r = new Random();

	public Producer(Buffer a) {

		sharedLocation = a;

	}

	@Override
	public void run() {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(r.nextInt(3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			sharedLocation.write(i);
			System.out.printf("\t p write %d", i);

			sum += i;
			System.out.printf("\t p sum %d\n", sum);

		}

		System.out.println("Producer had done producing");

	}

}
