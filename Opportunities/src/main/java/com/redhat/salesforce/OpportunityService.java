package com.redhat.salesforce;

import org.apache.camel.salesforce.dto.Opportunity;

public class OpportunityService {
	
	public Opportunity updateStatus(Opportunity opp, String stagestatus){
		
		
		Opportunity newOpp = new Opportunity();
		newOpp.setAccountId(opp.getAccountId());
		newOpp.setAmount(opp.getAmount());
		newOpp.setId(opp.getId());
		
		if(opp != null && "CLOSEWON".equalsIgnoreCase(stagestatus)){
			newOpp.setStageName(opp.getStageName().CLOSED_WON);
		}else if(opp != null && "PROSPECTING".equalsIgnoreCase(stagestatus)){
			newOpp.setStageName(opp.getStageName().PROSPECTING);
		}else {
			newOpp.setStageName(opp.getStageName().NEEDS_ANALYSIS);
		}
		
		
		
		return newOpp;
	}

}
