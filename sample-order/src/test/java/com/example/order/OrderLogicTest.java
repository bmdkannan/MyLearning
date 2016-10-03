package com.example.order;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.order.domain.Order;
import org.junit.*;
import static org.junit.Assert.*;
import com.example.order.OrderLogic;
import java.lang.Double;

public class OrderLogicTest {

	@Mock
	private Order order;

	private OrderLogic orderLogic;

	@Before
	public void setUp() throws Exception {
		orderLogic = new OrderLogic();
		MockitoAnnotations.initMocks(this);

	}

	/**
	 *
	 * @see com.example.order.OrderLogic#processOrder(Order)
	 */
	@Test
	public void tetProcessOrder() {
		Double result = orderLogic.processOrder(order);
		assertNotNull("result cannot be null", result);
	}

	/**
	 *
	 * @see com.example.order.OrderLogic#processOrder(Order)
	 */
	@Test(expected = RuntimeException.class)
	public void testProcessOrderWithException() {
		Double result = orderLogic.processOrder(null);
		assertNull("result can be null", result);
	}
}
