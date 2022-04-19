package org.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test
	public void testA1() {
		System.out.println("testA1");
	}
	@Test
	public void tesA2() {
		System.out.println("testb2");
	}
	@Test
	public void testA3() {
		System.out.println("testA3");
		Assert.assertTrue(false, "A3");
	}

}
