package com.hemalpatel.defaultandstaticmethods.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.defaultandstaticmethods.beans.Apple;
import com.hemalpatel.defaultandstaticmethods.beans.Mobile;
import com.hemalpatel.defaultandstaticmethods.beans.MobileSpecs;

public class DefaultStaticMethodExecutor implements BaseExecutor
{

	@Override
	public void run() {
		printTitle();
		
		Mobile iphoneX = new Apple("4 GB", "256 GB", "iPhone X", 999.99);
		iphoneX.log();
		Mobile.print();
		MobileSpecs.print();
		Apple.print();
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Static and Default methods -- \n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Static and Default methods --");
		System.out.println("*********************************\n");
	}

}
