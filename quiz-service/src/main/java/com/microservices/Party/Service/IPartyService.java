package com.microservices.Party.Service;

import com.microservices.Party.Entity.Party;

public interface IPartyService {
	
	public String saveParty(Party party);
	public Party findById(Integer partyId);
	public Party findByKeyAcct(String keyAcct);

}
