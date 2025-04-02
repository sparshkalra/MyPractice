package com.multithreading;

import java.util.Collections;

public class RunnableComparatorJava8 {
	
	Runnable r1 = () ->
	{
		try {
			//toe.printOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	
	//		Collections.sort(al, (a, b) -> Integer.compare(a[0], b[0]));


	
}
