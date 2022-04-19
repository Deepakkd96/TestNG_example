package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassC {
	
	@Test(retryAnalyzer = KnownFailed.class)
	public void testc1() {
		System.out.println("testc1");
		Assert.assertTrue(false);
	}
	@Test
	public void tesc2() {
		System.out.println("testc2");
	}
	@Test
	public void testc3() {
		System.out.println("testc3");
	}

}
