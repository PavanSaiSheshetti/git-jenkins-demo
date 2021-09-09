package com.jenkins_demo_git;

import junit.framework.TestCase;

public class AppTest2 extends TestCase {

	App app=new App();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSum() {
		assertEquals(10,app.sum(5,5));
	}

}
