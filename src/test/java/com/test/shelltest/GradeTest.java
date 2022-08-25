package com.test.shelltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GradeTest 
{
	Grade g;
	@Before
	public void before()
	{
		g = new Grade();
	}
	@Test
	public void testFirstClass()
	{
		String actualResult = g.calculateGrade(20);
		assertEquals("Fail",actualResult);
	}
	

}
