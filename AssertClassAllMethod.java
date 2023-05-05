package com.unitAssignment;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AssertClassAllMethod {
	
		@Ignore
		@Test
		public void Demo1() {
			int a=32,b=52;
			//Assert.assertTrue(a<b);
			Assert.assertFalse(a>b);
		}
		@Ignore
		@Test
		public void Demo2() {
			String s1="patel";
			String s2="null";
			
			Assert.assertNull(s2);
			//Assert.assertNotNull(s1);
		}
		@Ignore
		@Test
		public void Demo3() {
			String s1="charmi";
			String s2="charmi";
			String s3="null";
			//Assert.assertSame(s1, s2);
		Assert.assertNotSame(s1, s3);
			
			
		}
		@Ignore
		@Test
		public void Demo4() {
			int i1=23,i2=45;
					String s1="charmi";
					String s2="charmi";
					Assert.assertEquals(s1, s2);
		}
		@Ignore
		@Test
		public void Demo5() {
			int[] a= {1,2,3,4,5};
			int[] b= {1,2,3,4,5};
			Assert.assertArrayEquals(a, b);
		}
		@Test
		public void Demo6() {
			System.out.println("self failed by charmi");
			fail();
			
		}
}
	
	
