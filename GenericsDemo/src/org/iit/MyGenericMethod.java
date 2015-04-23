package org.iit;

public class MyGenericMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = { 1, 2, 3 };

		String[] b = { "a", "v", "s" };

		printArray(a);
		System.out.println();
		printArray(b);

		System.out.printf("Maximum is %d", maximum(5, 6, 7));

	}

	
	
	public static <E> void printArray(E [] a){
	 
	 
	for (E e : a) {
	
	 System.out.print(e.toString()+" ");
	 
	 }
	 
	 
	  }
	 

	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {

		T max=a;
		 
		 if(max.compareTo(b)<0) max=b;
		  
		 if(max.compareTo(c)<0) max=c;
		  
		  
		 return max;
	}

	/*
	 * public static Comparable maximum(Comparable a, Comparable b, Comparable
	 * c){
	 * 
	 * Comparable max=a;
	 * 
	 * if(max.compareTo(b)<0) max=b;
	 * 
	 * if(max.compareTo(c)<0) max=c;
	  * return max;
	
	 * }
	 */

}
