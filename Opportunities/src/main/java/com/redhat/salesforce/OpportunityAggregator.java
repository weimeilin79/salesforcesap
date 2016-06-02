package com.redhat.salesforce;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.camel.salesforce.dto.Opportunity;

public class OpportunityAggregator implements AggregationStrategy {
	
	List<Opportunity> opportunties = new ArrayList<Opportunity>();

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		
			
		 Opportunity newOpp = newExchange.getIn().getBody(Opportunity.class);
		 if (oldExchange == null) {
			 opportunties.add(newOpp);
			 newExchange.getIn().setBody(opportunties);
			 return newExchange;
	     }
		 List<Opportunity> opportunties = oldExchange.getIn().getBody(List.class);
		 
		 opportunties.add(newOpp);
	     
	     oldExchange.getIn().setBody(opportunties);
		
	     return oldExchange;
	}

}
