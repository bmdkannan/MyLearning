package com.example.order.domain;

/**
 * The Class Order.
 */
public class Order {

	/** The service A quantity. */
	private int serviceAQuantity;

	/** The service B quantity. */
	private int serviceBQuantity;

	/**
	 * Instantiates a new order.
	 *
	 * @param serviceAQuantity the service A quantity
	 * @param serviceBQuantity the service B quantity
	 */
	public Order(int serviceAQuantity, int serviceBQuantity) {
		this.serviceAQuantity = serviceAQuantity;
		this.serviceBQuantity = serviceBQuantity;
	}

	/**
	 * Gets the service A quantity.
	 *
	 * @return the service A quantity
	 */
	public int getServiceAQuantity() {
		return serviceAQuantity;
	}

	/**
	 * Gets the service B quantity.
	 *
	 * @return the service B quantity
	 */
	public int getServiceBQuantity() {
		return serviceBQuantity;
	}
}
