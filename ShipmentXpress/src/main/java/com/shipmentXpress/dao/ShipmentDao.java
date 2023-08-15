package com.shipmentXpress.dao;

import com.shipmentXpress.exception.ShipmentException;
import com.shipmentXpress.model.Shipment;

/**
 * The ShipmentDao interface defines methods for performing CRUD operations
 * related to shipments.
 */
public interface ShipmentDao {

	/**
	 * Adds a new shipment to the system.
	 *
	 * @param shipment The Shipment object to be added.
	 * @return A status message indicating the success or failure of the operation.
	 * @throws ShipmentException If an error occurs while adding the shipment.
	 */
	public String addShipment(Shipment shipment) throws ShipmentException;

	/**
	 * Deletes a shipment based on its shipment ID.
	 *
	 * @param shipmentId The ID of the shipment to be deleted.
	 * @return A status message indicating the success or failure of the operation.
	 * @throws ShipmentException If an error occurs while deleting the shipment.
	 */
	public String deteleShipment(int shipmentId) throws ShipmentException;

	/**
	 * Updates the details of a shipment.
	 *
	 * @param shipmentId The ID of the shipment to be updated.
	 * @param content    The new content description of the shipment.
	 * @param weight     The new weight of the shipment.
	 * @param address    The new recipient address of the shipment.
	 * @return The updated Shipment object.
	 * @throws ShipmentException If an error occurs while updating the shipment.
	 */
	public Shipment updateShipment(int shipmentId, String content, double weight, String address)
			throws ShipmentException;

	/**
	 * Retrieves a shipment based on its shipment ID.
	 *
	 * @param shipmentId The ID of the shipment to retrieve.
	 * @return The Shipment object corresponding to the given ID.
	 * @throws ShipmentException If an error occurs while retrieving the shipment.
	 */
	public Shipment getShipment(int shipmentId) throws ShipmentException;

}
