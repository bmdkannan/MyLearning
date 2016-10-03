package com.example.order;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.example.order.domain.Order;
import com.example.order.service.ServiceA;
import com.example.order.service.ServiceAA;
import com.example.order.service.ServiceB;
import com.example.order.service.ServiceC;

/**
 * The Class OrderLogic.
 */
public class OrderLogic {

	/**
	 * Process order.
	 *
	 * @param order the order
	 * @return the double
	 */
	public Double processOrder(Order order) {

		Double result = null;

		ExecutorService pool = Executors.newFixedThreadPool(2);

		Callable<Double> serviceA = new ServiceA(order.getServiceAQuantity());
		Callable<Double> serviceB = new ServiceB(order.getServiceBQuantity());

		Future<Double> serviceAFuture = pool.submit(serviceA);
		Future<Double> serviceBFuture = pool.submit(serviceB);

		pool.shutdown();
		try {
			pool.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e1) {
			System.out.println("Exception occurs while terminating all threads in the pools");
			e1.printStackTrace();
		}

		ServiceAA serviceAA = null;
		try {
			serviceAA = new ServiceAA(serviceAFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("ServiceA result is null");
			e.printStackTrace();
		}

		if (serviceAA != null) {
			ServiceC serviceC;
			try {
				serviceC = new ServiceC(serviceAA.getServiceAATotalCost(), serviceBFuture.get());
				result = serviceC.getServiceCTotalCost();
			} catch (InterruptedException | ExecutionException e) {
				System.out.println("ServiceB result is null");
				e.printStackTrace();
			}
		} else {
			System.out.println("ServiceAA result is null");
		}

		return result;
	}
}
