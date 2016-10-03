package com.example.order.domain;

import org.junit.*;
import static org.junit.Assert.*;
import com.example.order.domain.Order;

public class OrderTest {

	private Order order;

	@Before
	public void setUp() throws Exception {
		order = new Order(10, 5);

	}

	/**
	 *
	 * @see com.example.order.domain.Order#getServiceAQuantity()
	 */
	@Test
	public void getServiceAQuantity() {
		int serviceaquantity = order.getServiceAQuantity();
		assertNotNull("serviceaquantity cannot be null", serviceaquantity);
	}

	/**
	 *
	 * @see com.example.order.domain.Order#getServiceBQuantity()
	 */
	@Test
	public void getServiceBQuantity() {
		int servicebquantity = order.getServiceBQuantity();
		assertNotNull("servicebquantity cannot be null", servicebquantity);
	}
}
