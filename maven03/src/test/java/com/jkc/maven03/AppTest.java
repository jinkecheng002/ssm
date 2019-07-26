package com.jkc.maven03;


import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	@org.junit.Test
	public void test() {
		App app = new App();
		System.out.println("apptest"+app.say());
	}
}
