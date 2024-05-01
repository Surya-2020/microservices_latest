package com.microservices.Party.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.Party.Entity.Party;
import com.microservices.Party.Repo.PartyServiceRepo;
import com.microservices.Party.Service.IPartyService;

@Service
public class PartyServiceImpl implements IPartyService {


	@Autowired
	private PartyServiceRepo partySvcRepo;

	@Override
	public Party findById(Integer partyId) {
		return partySvcRepo.findById(partyId);

	}
	

	@Override
	public Party findByKeyAcct(String keyAcct) {
		return null;/* partySvcRepo.findByKeyAcct(keyAcct) */
	}

	@Override
	public String saveParty(Party party) {
		partySvcRepo.save(party);
		return "Party Saved Successfully";
	}
}
