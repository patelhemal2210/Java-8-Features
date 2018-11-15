package com.hemalpatel.defaultandstaticmethods.beans;

public interface Mobile {
	
	public String getName();
	public Double getPrice();
	
	
	/*
	 * 1. default method makes interface similar to abstract class
	 * 2. Default metod can be overridden by subclass
	 * 3. Instance need to be created to call the default method
	 */
	default void log() {
		System.out.println("Mobile Interface instance : name - " + getName() + " Price - " + getPrice());
	}
	
	/*
	 * 1. An interface's static method is similar to a class's static method
	 * 2. It can only call other static method but not the default method
	 * 3. Can be accessed without creating instance
	 * 4. Subclass defination of the same static method will not be overridden
	 */
	static void print() {
		System.out.println("Mobile Interface static print method");
	}
}
