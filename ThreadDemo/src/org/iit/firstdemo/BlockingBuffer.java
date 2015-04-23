package org.iit.firstdemo;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {

	final ArrayBlockingQueue<Integer> b;

	public BlockingBuffer() {

		b = new ArrayBlockingQueue<Integer>(1);
	}

	@Override
	public void write(int a) {

		try {
			b.put(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public int read() {
		int value = 0;

		try {
			value = b.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;
	}

}
