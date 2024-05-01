package com.microservices.Party.Model;

import com.microservices.Party.Entity.Party;

public class ResponseModel {

	
	private Party party;
	private Account account;
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "ResponseModel [party=" + party + ", account=" + account + "]";
	}
	
	
}
