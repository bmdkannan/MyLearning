package com.example.order.service;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.concurrent.Callable;

import com.example.order.service.ServiceB;

public class ServiceBTest {

	private Callable<Double> serviceB;

	@Before
	public void setUp() throws Exception {
		serviceB = new ServiceB(10);

	}

	/**
	 *
	 * @see com.example.order.service.ServiceB#call()
	 */
	@Test
	public void testCall() {
		try {
			Double result = serviceB.call();

			assertTrue("result should not be null.", result != null);
		} catch (Exception exception) {
			exception.printStackTrace();
			fail("Test for call failed " + exception.getMessage());
		}
	}
	
	/**
	 *
	 * @see com.example.order.service.ServiceB#call()
	 */
	@Test(expected = Exception.class)
	public void testCallWithException() throws Exception {
		serviceB = null;
		Double result = serviceB.call();
		assertNull("result can be null", result);
	}
}
