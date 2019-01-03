package com.le.beans;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileFilter;

public class FirstLamb {

	public static void main(String[] args) {
		
		/*while (true) {
			Toolkit.getDefaultToolkit().beep();
		}
*/		
		
		FileFilter filter= (File file) -> file.getName().endsWith(".java");
		
		File dir= new File("c:\\test");
		
		File[] filenames= dir.listFiles(filter);
		
		for (File f : filenames) {
			System.out.println(f);
		}
		
		/**
		 * Lambda expression is a functional interface in order to support functional development 
		 * Functional interface must and should have one abstract method
		 * May have more than one default method
		 * 
		 * Lambda is special kind of object which is refereed as an  object without identity 
		 * 
		 * We can write a variable without specifying the type of the variable
		 */
		System.out.println("===============================");
		
		Runnable runnable =() ->
		{
			for (int i = 0; i < 2; i++) {
				
				System.out.println("Hi");
				
			}
			
		};
		
		Thread t1= new Thread(runnable);
		Thread t2= new Thread(runnable);
		t1.start();
		t2.start();
		
	}
	
	
}
