package com.example.order.service;

/**
 * The Class ServiceAA.
 */
public class ServiceAA {

	/** The service AA total cost. */
	private double serviceAATotalCost;

	/** The service AA unit cost. */
	private double serviceAAUnitCost = 2000.00;

	/**
	 * Instantiates a new service AA.
	 *
	 * @param serviceACost the service A cost
	 */
	public ServiceAA(double serviceACost) {
		this.serviceAATotalCost = serviceACost + serviceAAUnitCost;
	}

	/**
	 * Gets the service AA total cost.
	 *
	 * @return the service AA total cost
	 */
	public double getServiceAATotalCost() {
		return this.serviceAATotalCost;
	}
}
