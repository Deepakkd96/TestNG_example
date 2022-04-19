package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {
	
	@Test
	public void testB1() {
		System.out.println("testb1");
	}
	@Test
	public void tesB2() {
		System.out.println("testb2");
		Assert.assertTrue(false, "B1");
	}
	@Test
	public void testB3() {
		System.out.println("testb3");
	}

}
