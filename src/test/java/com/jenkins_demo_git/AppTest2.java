package com.jenkins_demo_git;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest2 {
	
	App app=new App();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		assertEquals(10, app.sum(10,10));
	}

}
