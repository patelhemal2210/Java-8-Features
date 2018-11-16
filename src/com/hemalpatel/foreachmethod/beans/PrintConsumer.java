package com.hemalpatel.foreachmethod.beans;

import java.util.function.Consumer;


/*
 * Can be reused for multiple foreach function
 */
public class PrintConsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
