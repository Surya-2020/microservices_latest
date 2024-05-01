package com.microservices.Party.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.Party.Entity.Party;
import com.microservices.Party.Model.Account;
import com.microservices.Party.Model.GetPartyWithAccountResponse;
import com.microservices.Party.Model.PartyWithAccountModel;
import com.microservices.Party.Repo.PartyAccountRepo;
import com.microservices.Party.Repo.PartyServiceRepo;
import com.microservices.Party.Service.IPartyService;
import com.microservices.Party.feignclient.FeignClientInterface;

@Service
public class MicroService {

	@Autowired
	private IPartyService partySvc;

	@Autowired
	private FeignClientInterface feignClientInterface;

	@Autowired
	PartyAccountRepo partyAccountRepo;

	@Autowired
	PartyServiceRepo partyServiceRepo;

	public GetPartyWithAccountResponse getPartyAndAccountInfo(Integer partyId) {
		Party party = partySvc.findById(partyId);
		List<Account> acts = feignClientInterface.getAccountByPartyId(partyId).getBody();
		GetPartyWithAccountResponse resp = new GetPartyWithAccountResponse();
		resp.setAccount(acts);
		resp.setParty(party);
		return resp;
	}

	public String savePartyWithAccount(PartyWithAccountModel model) {

		partyServiceRepo.save(model.getParty());
		try {
			feignClientInterface.saveAccount(model.getAccount());
		} catch (Exception exp) {
			return "exception occured while saving the account";
		}
		return "PartyWithAccount saved Successfully";
	}

}
