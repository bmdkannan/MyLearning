package com.example.order.service;

/**
 * The Class ServiceC.
 */
public class ServiceC {
	
	/** The service C total cost. */
	private double serviceCTotalCost;

	/** The service C unit cost. */
	private double serviceCUnitCost = 3000.00;
	
	/**
	 * Instantiates a new service C.
	 *
	 * @param serviceAACost the service AA cost
	 * @param serviceBCost the service B cost
	 */
	public ServiceC(double serviceAACost, double serviceBCost) {
		this.serviceCTotalCost = serviceAACost + serviceBCost + serviceCUnitCost;
	}
	
	/**
	 * Gets the service C total cost.
	 *
	 * @return the service C total cost
	 */
	public double getServiceCTotalCost() {
		return this.serviceCTotalCost;
	}
}
