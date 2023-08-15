package com.shipmentXpress.exception;

/**
 * Custom exception class for handling shipment-related errors.
 */
public class ShipmentException extends Exception {

	/**
	 * Constructs a new ShipmentException with the specified error message.
	 *
	 * @param message The error message describing the reason for the exception.
	 */
	public ShipmentException(String message) {
		// Call the constructor of the parent class (Exception) with the provided
		// message
		super(message);
	}

}
