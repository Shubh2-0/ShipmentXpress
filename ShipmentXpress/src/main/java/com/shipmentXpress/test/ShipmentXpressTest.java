package com.shipmentXpress.test;

import java.sql.Timestamp;
import java.util.Date;

import com.shipmentXpress.dao.ShipmentDao;
import com.shipmentXpress.dao.ShipmentDaoImpl;
import com.shipmentXpress.exception.ShipmentException;
import com.shipmentXpress.model.Shipment;

/**
 * The ShipmentXpressTest class demonstrates the functionality of the
 * ShipmentXpress project.
 */
public class ShipmentXpressTest {

	/**
	 * The main method is the entry point for testing the ShipmentXpress project.
	 *
	 * @param args Command-line arguments (not used in this context).
	 */
	public static void main(String[] args) {
		ShipmentDao shipmentDao = new ShipmentDaoImpl();

		// Add a new shipment
		Shipment newShipment = new Shipment("BD5678768", "Vegetable Basket", 4.5, "K 28, Green Park Extn, New Delhi",
				"Akshya Nagar 1st Block, Rammurthy nagar, Bangalore", new Timestamp(new Date().getTime()));

		try {
			String addStatus = shipmentDao.addShipment(newShipment);
			System.out.println(addStatus);
		} catch (ShipmentException e) {
			System.err.println("Error adding shipment: " + e.getMessage());
		}

		// Update shipment details
		try {
			Shipment updatedShipment = shipmentDao.updateShipment(newShipment.getShipmentId(), "Updated Content", 5.0,
					"New Recipient Address");
			System.out.println("Updated Shipment: " + updatedShipment);
		} catch (ShipmentException e) {
			System.err.println("Error updating shipment: " + e.getMessage());
		}

		// Get shipment by ID
		try {
			Shipment retrievedShipment = shipmentDao.getShipment(newShipment.getShipmentId());
			System.out.println("Retrieved Shipment: " + retrievedShipment);
		} catch (ShipmentException e) {
			System.err.println("Error getting shipment: " + e.getMessage());
		}

		// Delete shipment by ID
		try {
			String deleteStatus = shipmentDao.deteleShipment(newShipment.getShipmentId());
			System.out.println(deleteStatus);
		} catch (ShipmentException e) {
			System.err.println("Error deleting shipment: " + e.getMessage());
		}
	}
}
