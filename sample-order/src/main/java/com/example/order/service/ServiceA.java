package com.example.order.service;

import java.util.concurrent.Callable;

/**
 * The Class ServiceA.
 */
public class ServiceA implements Callable<Double> {

	/** The quantity. */
	private int quantity;

	/** The service A unit cost. */
	private double serviceAUnitCost = 1000.00;

	/** The service A total cost. */
	private Double serviceATotalCost;

	/**
	 * Instantiates a new service A.
	 *
	 * @param quantity the quantity
	 */
	public ServiceA(int quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public Double call() throws Exception {
		// saveServiceAInfo();
		this.serviceATotalCost = this.quantity * this.serviceAUnitCost;
		return this.serviceATotalCost;
	}
}
