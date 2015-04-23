package org.iit.firstdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintTask t1=new PrintTask("Task 1");		
		PrintTask t2=new PrintTask("Task 2");		
		PrintTask t3=new PrintTask("Task 3");		

		ExecutorService t=Executors.newCachedThreadPool();
		
		t.execute(t1);
		t.execute(t2);
		t.execute(t3);
		
		System.out.println("main ends");

		
		
		
		
		
		
	}

}
