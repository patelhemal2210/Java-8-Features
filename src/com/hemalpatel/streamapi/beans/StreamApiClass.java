package com.hemalpatel.streamapi.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiClass {

	public void method() {
		/*
		 * Create a list to hold data
		 */
		List<Integer> data = new ArrayList<>();
		
		/*
		 * Put the data into collection
		 */
		for(Integer var = 1; var <= 50; var++) {
			data.add(var);
		}
		
		/*
		 * Create sequential stream 
		 */
		System.out.println("Sequential list : ");
		long startTime = System.nanoTime();
		Stream sequentialStream = data.stream();
		Stream<Integer> higherRange = sequentialStream.filter(p -> (int)p > 40);
		higherRange.forEach(p -> System.out.println("High number sequential : " + p));
		long endTime = System.nanoTime();
		long sequentialExecutionTime = (endTime - startTime)/1000000; // ns to ms
		System.out.println("Sequential Execution Time :  "+ sequentialExecutionTime + " ms"); 
		
		/*
		 * create Parallel stream
		 */
		System.out.println("\nParallel List : ");
		startTime = System.nanoTime();
		Stream parallelStream = data.parallelStream();
		Stream<Integer> higherRange2 = parallelStream.filter(p -> (int)p > 40);
		higherRange2.forEach(p -> System.out.println("High number parallel : " + p));
		endTime = System.nanoTime();
		long parallelExecutionTime = (endTime - startTime)/1000000;
		System.out.println("Parallel Execution Time :  "+ parallelExecutionTime + " ms"); 
		
		System.out.println("\nParallel is " + (sequentialExecutionTime / parallelExecutionTime) + " times faster than sequantial");
	}
}
