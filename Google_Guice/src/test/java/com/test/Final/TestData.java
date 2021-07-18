package com.test.Final;

import com.google.inject.Inject;

public class TestData {
	private SkuData sSkuData;

	@Inject
	public TestData(SkuData sSkuData) {
		this.sSkuData = sSkuData;
	}

	public void getSkuData() {
		sSkuData.getSku();
	}
}
