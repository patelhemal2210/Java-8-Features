package com.hemalpatel.streamapi.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.streamapi.beans.StreamApiClass;

public class StreamApiExecutor implements BaseExecutor {

	@Override
	public void run() {
		
		printTitle();
		
		StreamApiClass stream = new StreamApiClass();
		stream.method();
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Stream API methods -- \n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Stream API methods --");
		System.out.println("*********************************\n");
	}

	
}
