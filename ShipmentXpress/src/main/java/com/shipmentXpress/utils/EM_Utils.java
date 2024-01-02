package com.shipmentXpress.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * The EM_Utils class provides utility methods for managing the EntityManager
 * instance.
 */
public class EM_Utils {

	// Creating a single EntityManagerFactory instance for the entire application
	static final EntityManagerFactory emf;

	static {
		// Initializing the EntityManagerFactory with the "ShipmentXpressUnit"
		// persistence unit
		emf = Persistence.createEntityManagerFactory("ShipmentXpressUnit");
	}

	/**
	 * Creates and returns a new EntityManager instance.
	 *
	 * @return An EntityManager instance for database operations.
	 */
	public static EntityManager getConnection() {
		// Creating a new EntityManager instance from the EntityManagerFactory
		return emf.createEntityManager();
	}
}
