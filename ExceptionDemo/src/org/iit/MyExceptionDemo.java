package org.iit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyExceptionDemo {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		f1();
	}

	static void f1() {

		fileOpen("C:\\kisuekta");

	}

	static void fileOpen(String pathName) {

		BufferedReader brd=null;
		try {
		 brd= new BufferedReader(new FileReader(new File(
					pathName)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
						
			try {
				brd.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		
		
		
		
		
		
	}

}
