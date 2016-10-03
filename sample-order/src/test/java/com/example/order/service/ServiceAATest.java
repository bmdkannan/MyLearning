package com.example.order.service;

import org.junit.*;
import static org.junit.Assert.*;
import com.example.order.service.ServiceAA;

public class ServiceAATest {

	private ServiceAA serviceAA;

	@Before
	public void setUp() throws Exception {
		serviceAA = new ServiceAA(10.0);

	}

	/**
	 *
	 * @see com.example.order.service.ServiceAA#getServiceAATotalCost()
	 */
	@Test
	public void testGetServiceAATotalCost() {
		double serviceaatotalcost = serviceAA.getServiceAATotalCost();
		assertNotNull("serviceaatotalcost cannot be null", serviceaatotalcost);
	}
}
