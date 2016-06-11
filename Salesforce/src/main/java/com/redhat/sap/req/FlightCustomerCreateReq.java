package com.redhat.sap.req;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Request") 
public class FlightCustomerCreateReq {

	@XmlElement(name = "CUSTOMER_DATA", required = true) 
    protected CustomerData customerData;

	

	public FlightCustomerCreateReq setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
		
		return this;
	} 
	
	
	
}
