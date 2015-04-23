package org.iit.firstdemo;

import java.util.Random;

public class Consumer implements Runnable {

	final Buffer sharedLocation;
	final Random r = new Random();

	public Consumer(Buffer a) {

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

			int value = sharedLocation.read();
			System.out.printf("\t c read %d", value);

			sum += value;
			
			System.out.printf("\t c sum %d\n", sum);

		}

		System.out.println("Consumer had done reading");

	}

}
