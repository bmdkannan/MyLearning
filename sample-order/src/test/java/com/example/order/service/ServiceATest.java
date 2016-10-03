package com.example.order.service;

import org.junit.*;
import static org.junit.Assert.*;
import com.example.order.service.ServiceA;
import java.lang.Double;
import java.lang.Exception;
import java.util.concurrent.Callable;

public class ServiceATest {

	private Callable<Double> serviceA;

	@Before
	public void setUp() throws Exception {
		serviceA = new ServiceA(10);

	}

	/**
	 *
	 * @see com.example.order.service.ServiceA#call()
	 */
	@Test
	public void call() {
		try {
			Double result = serviceA.call();
			assertNotNull("result cannot be null", result);
		} catch (Exception exception) {
			exception.printStackTrace();
			fail("Test for call failed " + exception.getMessage());
		}
	}

	/**
	 *
	 * @see com.example.order.service.ServiceA#call()
	 */
	@Test(expected = Exception.class)
	public void testCallWithException() throws Exception {
		serviceA = null;
		Double result = serviceA.call();
		assertNull("result can be null", result);
	}
}
