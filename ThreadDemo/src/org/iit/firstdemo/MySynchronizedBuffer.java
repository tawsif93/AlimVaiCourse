package org.iit.firstdemo;

public class MySynchronizedBuffer implements Buffer {

	int buffer = -1;

	boolean occupied = false;

	@Override
	public synchronized void write(int a) {

		while (occupied) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		buffer = a;

		occupied=true;
		
		notifyAll();
	}

	@Override
	public synchronized int read() {

		
		while(!occupied){
			
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		occupied=false;
		notifyAll();
		
		
		
		return buffer;
	}

}
