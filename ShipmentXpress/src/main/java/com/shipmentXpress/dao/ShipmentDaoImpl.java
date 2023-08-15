package com.shipmentXpress.dao;

import java.util.List;
import javax.persistence.EntityManager;
import com.shipmentXpress.exception.ShipmentException;
import com.shipmentXpress.model.Shipment;
import com.shipmentXpress.utils.EM_Utils;

/**
 * Implementation of the ShipmentDao interface for managing shipments.
 */
public class ShipmentDaoImpl implements ShipmentDao {

    /**
     * Adds a new shipment to the system.
     *
     * @param shipment The Shipment object to be added.
     * @return A status message indicating the success or failure of the operation.
     * @throws ShipmentException If an error occurs while adding the shipment.
     */
    @Override
    public String addShipment(Shipment shipment) throws ShipmentException {
        // Establishing a connection to the database
        EntityManager em = EM_Utils.getConnection();

        Shipment sp = null;

        // Checking if a shipment with the given ID already exists
        sp = em.find(Shipment.class, shipment.getShipmentId());

        if (sp != null)
            throw new ShipmentException("Shipment with this id already present");

        // Starting a transaction, persisting the new shipment, committing the transaction, and closing the connection
        em.getTransaction().begin();
        em.persist(shipment);
        em.getTransaction().commit();
        em.close();

        return "Shipment successfully added...";
    }

    /**
     * Deletes a shipment based on its shipment ID.
     *
     * @param shipmentId The ID of the shipment to be deleted.
     * @return A status message indicating the success or failure of the operation.
     * @throws ShipmentException If an error occurs while deleting the shipment.
     */
    @Override
    public String deteleShipment(int shipmentId) throws ShipmentException {
        // Establishing a connection to the database
        EntityManager em = EM_Utils.getConnection();

        Shipment sp = null;

        // Retrieving the shipment with the given ID
        sp = em.find(Shipment.class, shipmentId);

        if (sp == null)
            throw new ShipmentException("Shipment with Id is not present : " + shipmentId);

        // Starting a transaction, removing the shipment, committing the transaction, and closing the connection
        em.getTransaction().begin();
        em.remove(sp);
        em.getTransaction().commit();
        em.close();

        return "Shipment successfully removed.....";
    }

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
    @Override
    public Shipment updateShipment(int shipmentId, String content, double weight, String address)
            throws ShipmentException {
        // Establishing a connection to the database
        EntityManager em = EM_Utils.getConnection();

        Shipment sp = null;

        // Retrieving the shipment with the given ID
        sp = em.find(Shipment.class, shipmentId);

        if (sp == null)
            throw new ShipmentException("No shipment found with this ID : " + shipmentId);

        // Updating shipment details, starting a transaction, merging the changes, committing the transaction, and closing the connection
        sp.setContent(content);
        sp.setWeight(weight);
		sp.setSrecipientAddress(address);

        em.getTransaction().begin();
        em.merge(sp);
        em.getTransaction().commit();
        em.close();

        return sp;
    }

    /**
     * Retrieves a shipment based on its shipment ID.
     *
     * @param shipmentId The ID of the shipment to retrieve.
     * @return The Shipment object corresponding to the given ID.
     * @throws ShipmentException If an error occurs while retrieving the shipment.
     */
    @Override
    public Shipment getShipment(int shipmentId) throws ShipmentException {
        // Establishing a connection to the database
        EntityManager em = EM_Utils.getConnection();

        Shipment shipment = null;

        // Retrieving the shipment with the given ID
        shipment = em.find(Shipment.class, shipmentId);

        if (shipment == null)
            throw new ShipmentException("No shipment found with this ID : " + shipmentId);

        return shipment;
    }
}
