package com.redhat.salesforce;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.salesforce.dto.Opportunity;

public class OpportunityCache{
	
	List<Opportunity> opportunties = new ArrayList<Opportunity>();

	
	public void addOpps(Opportunity newOpp) throws Exception {
		
		 opportunties.add(newOpp);
	     
	}
	
	public List<Opportunity> getAllOpps() throws Exception {
		
		 return opportunties;
	     
	}

}
