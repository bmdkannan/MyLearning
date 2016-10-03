package com.example.order.service;

import org.junit.*;
import static org.junit.Assert.*;
import com.example.order.service.ServiceC;

public class ServiceCTest {

	private ServiceC serviceC;

	@Before
	public void setUp() throws Exception {
		serviceC = new ServiceC(10.0, 5.0);

	}

	/**
	 *
	 * @see com.example.order.service.ServiceC#getServiceCTotalCost()
	 */
	@Test
	public void getServiceCTotalCost() {
		double servicectotalcost = serviceC.getServiceCTotalCost();
		assertNotNull("servicectotalcost cannot be null", servicectotalcost);
	}
}
