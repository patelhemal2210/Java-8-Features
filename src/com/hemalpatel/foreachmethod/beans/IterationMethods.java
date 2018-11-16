package com.hemalpatel.foreachmethod.beans;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import com.hemalpatel.foreachmethod.beans.PrintConsumer;

public class IterationMethods {
	
	private List<String> data;
	
	public IterationMethods(List<String> data) {
		this.data = data;
	}
	
	public void traditionalMethod() {
		for(String str : data) {
			System.out.println(str);
		}
	}
	
	public void iteratorMethod() {
		Iterator<String> it = data.iterator();
		while(it.hasNext()){
			String i = it.next();
			System.out.println(i);
		}
	}
	
	public void foreachAnonymousMethod() {
		data.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
	}
	
	public void foreachCustomMethod() {
		PrintConsumer action = new PrintConsumer();
		data.forEach(action);
	}
}
