package com.hemalpatel.foreachmethod.executor;

import java.util.ArrayList;
import java.util.List;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.foreachmethod.beans.IterationMethods;

public class ForeachMethodExecutor implements BaseExecutor {

	@Override
	public void run() {
		printTitle();
		
		List<String> data = new ArrayList<>();
		
		data.add("name");
		data.add("phone");
		data.add("address");
		data.add("country");
		data.add("postal code");
		
		IterationMethods methods = new IterationMethods(data);
		
		/*
		 * Traditional method
		 */
		System.out.println("Traditional Method : ");
		methods.traditionalMethod();
		
		/*
		 * Iterator
		 */
		System.out.println("\nIterator Method : ");
		methods.iteratorMethod();
		
		/*
		 * Foreach with anonymous class
		 */
		System.out.println("\nForeach Anonymous method : ");
		methods.foreachAnonymousMethod();
		
		/*
		 * Foreach with custom class
		 */
		System.out.println("\nForeach Custom Method : ");
		methods.foreachCustomMethod();
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Foreach methods -- \n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Foreach methods --");
		System.out.println("*********************************\n");
	}

}
