package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testDemo() {
		assertEquals(3, 1+2);
	}
	@Test
	public void testFriendlyness() {
		assertTrue(new HelloWorld().getMessage().startsWith("hi"));
	}
	
	@Test
	public void testFailure() {
		assertEquals(3, 1+4);
	}
	
}
