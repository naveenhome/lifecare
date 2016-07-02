package com.lifecare;

import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	public void testCase1()
	{
		int []arr = {6,4,3,8,1};
		Largest obj = new Largest();
		assertEquals(8, obj.find(arr));
		
	}

}
