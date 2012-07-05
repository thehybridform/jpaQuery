package com.huskycode.jpaquery.testmodel.pizza;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Model taken from the design here
 * 
 * http://www.databaseanswers.org/data_models/pizza_deliveries/index.htm
 * 
 * @author Varokas Panusuwan
 *
 */
@Entity
public class Order {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;
	
	private long customerId;
	private long takenByEmployeeId;
	private long deliveredByEmployeeId;
	//private long deliveryStatusCode;
	private long vehicleId;
	
	private Date dateTimeOrderTaken;
	private Date dateTimeOrderDelivered;
	private double totalOrderPrice;
	private String otherOrderDetails;
}