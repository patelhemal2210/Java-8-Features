package com.hemalpatel.defaultandstaticmethods.beans;

public class Apple implements Mobile, MobileSpecs{

	private String RAM;
	private String memory;
	private String name;
	private Double price;
	
	
	
	public Apple(String RAM, String memory, String name, Double price) {
		super();
		this.RAM = RAM;
		this.memory = memory;
		this.name = name;
		this.price = price;
	}

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getMemory() {
		return memory;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getPrice() {
		return price;
	}

	/*
	 * Duplicate default method has to be overridden by class
	 */
	@Override
	public void log() {
		Mobile.super.log();
		MobileSpecs.super.log();
	}
	
	/*
	 * Overridding static method will not affect interface static method
	 */
	public static void print() {
		System.out.println("Apple class static print method");
	}

}
