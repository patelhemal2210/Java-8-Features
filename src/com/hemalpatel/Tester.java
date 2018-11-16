package com.hemalpatel;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.defaultandstaticmethods.executor.DefaultStaticMethodExecutor;
import com.hemalpatel.foreachmethod.executor.ForeachMethodExecutor;

public class Tester {

	public static void main(String[] args) {
		BaseExecutor executor = new DefaultStaticMethodExecutor();
		executor.run();
		
		executor = new ForeachMethodExecutor();
		executor.run();
	}
}
