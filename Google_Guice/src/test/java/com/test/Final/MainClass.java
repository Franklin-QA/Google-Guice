package com.test.Final;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainClass {

	public static void main(String[] args) {
	      Injector injector = Guice.createInjector(new AppModule());
	      TestData skuData = injector.getInstance(TestData.class);
	      skuData.getSkuData();
	   }
	
}
