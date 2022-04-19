package org.test;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "smoke")
	private void test1() {
		System.out.println("test1");
	}
	@Test(groups = "sanity")
	private void test2() {
		System.out.println("test2");
	}
	@Test(groups = {"smoke","sanity"})
	private void test3() {
		System.out.println("test3");
	}
	@Test(groups = {"regression","smoke"})
	private void test4() {
		System.out.println("test4");
	}
	@Test(groups = "regression")
	private void test5() {
		System.out.println("test5");
	}
	@Test(groups = "smoke")
	private void test6() {
		System.out.println("test6");
	}
	@Test(groups = {"sanity","regression"})
	private void test7() {
		System.out.println("test7");
	}
	@Test
	private void test8() {
		System.out.println("test8");
	}
	@Test(groups = "smoke")
	private void test9() {
		System.out.println("test9");
	}
	@Test(groups = "regression")
	private void test10() {
		System.out.println("test10");
	}
	@Test(groups = {"sanity","smoke"})
	private void test11() {
		System.out.println("test11");
	}	

}
