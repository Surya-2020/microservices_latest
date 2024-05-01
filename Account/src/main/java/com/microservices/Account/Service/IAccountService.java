package com.microservices.Account.Service;

import java.util.List;

import com.microservices.Account.Entity.Account;

public interface IAccountService {

	public String saveAccount(List<Account> model);
	
	public Account findById(String actNum);
	
	public Account findByKeyAcct(String keyAcct);

	public List<Account> findByPartyId(Integer partyId);
}
