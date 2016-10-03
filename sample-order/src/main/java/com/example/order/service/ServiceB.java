package com.example.order.service;

import java.util.concurrent.Callable;

/**
 * The Class ServiceB.
 */
public class ServiceB implements Callable<Double> {

	/** The quantity. */
	private int quantity;

	/** The service B unit cost. */
	private double serviceBUnitCost = 2000.00;

	/** The service B total cost. */
	private Double serviceBTotalCost;

	/**
	 * Instantiates a new service B.
	 *
	 * @param quantity the quantity
	 */
	public ServiceB(int quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public Double call() throws Exception {
		// saveServiceBInfo();
		this.serviceBTotalCost = this.quantity * this.serviceBUnitCost;
		return this.serviceBTotalCost;
	}
}
