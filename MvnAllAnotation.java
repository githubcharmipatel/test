package com.mvn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MvnAllAnotation {
	
		@BeforeClass
		public static void beforeclass() {
			System.out.println("this is beforeclass...");
			
		}
		@Before
		public void beforetest() {
			System.out.println("this is before test...");
		}
			
		@Test
		public void test() {
			System.out.println("this is main test...");
			
		}
		@Test
		public void test1() {
			System.out.println("this is test1...");
		}
		@After
		public void aftertest() {
			System.out.println("this is aftertest...");
			
		}
		@AfterClass
		public static void afterclass() {
			System.out.println("this is afterclass...");
			
		}
		
}
