package com.shipmentXpress.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Shipment class represents a shipment with its attributes.
 */
@Entity
@Table(name = "shipment")
@Data
@NoArgsConstructor
public class Shipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipmentId; // Unique ID for the shipment
	private String packageNumber; // Identification number for the package
	private String content; // Description of the shipment content
	private double weight; // Weight of the shipment
	private String senderAddress; // Address of the sender
	private String SrecipientAddress; // Address of the recipient

	@Temporal(TemporalType.TIMESTAMP)
	private Date created_timestamp; // Timestamp of when the shipment was created

	/**
	 * Constructs a Shipment object with the specified attributes.
	 *
	 * @param packageNumber     Identification number for the package.
	 * @param content           Description of the shipment content.
	 * @param weight            Weight of the shipment.
	 * @param senderAddress     Address of the sender.
	 * @param srecipientAddress Address of the recipient.
	 * @param created_timestamp Timestamp of when the shipment was created.
	 */
	public Shipment(String packageNumber, String content, double weight, String senderAddress, String srecipientAddress,
			Timestamp created_timestamp) {
		super();
		this.packageNumber = packageNumber;
		this.content = content;
		this.weight = weight;
		this.senderAddress = senderAddress;
		SrecipientAddress = srecipientAddress;
		this.created_timestamp = created_timestamp;
	}
}
