package com.microservices.Account.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String accountNumber;
	private String accountType;
	private String bankName;
	private String keyAccount;
	private Integer partyId;

	public Long getId() {
		return id;
	}

	
	
	



	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getKeyAccount() {
		return keyAccount;
	}

	public void setKeyAccount(String keyAccount) {
		this.keyAccount = keyAccount;
	}



	


	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountType=" + accountType + ", bankName="
				+ bankName + ", keyAccount=" + keyAccount + ", partyId=" + partyId + "]";
	}







	public Account(Long id, String accountNumber, String accountType, String bankName, String keyAccount,
			Integer partyId) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.bankName = bankName;
		this.keyAccount = keyAccount;
		this.partyId = partyId;
	}







	public Integer getPartyId() {
		return partyId;
	}







	public void setPartyId(Integer partyId) {
		this.partyId = partyId;
	}







	public Account() {
		super();
	}

}
