package com.microservices.Party.Model;

import java.util.List;

import com.microservices.Party.Entity.Party;

public class GetPartyWithAccountResponse {

	
	private Party party;
	private List<Account> account;
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "GetPartyWithAccountResponse [party=" + party + ", account=" + account + "]";
	}
	
	
	
	
}
