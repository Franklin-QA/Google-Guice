package com.test.Final;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
	
	@Override
	protected void configure() {
		 bind(SkuData.class).to(SkuDatas.class);
	}
	
}
