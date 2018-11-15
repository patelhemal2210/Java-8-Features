package com.hemalpatel;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.defaultandstaticmethods.executor.DefaultStaticMethodExecutor;

public class Tester {

	public static void main(String[] args) {
		BaseExecutor executor = new DefaultStaticMethodExecutor();
		executor.run();
	}

}
