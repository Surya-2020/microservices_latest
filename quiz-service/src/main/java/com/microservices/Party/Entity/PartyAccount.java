package com.microservices.Party.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PartyAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serialNo;
	
	private String partyId;
	
	private String accountNum;
	
	private String partyName;
	
	private String mobileNum;
	
	private String bankName;

	
	

	@Override
	public String toString() {
		return "PartyAccount [serialNo=" + serialNo + ", partyId=" + partyId + ", accountNum=" + accountNum
				+ ", partyName=" + partyName + ", mobileNum=" + mobileNum + ", bankName=" + bankName + "]";
	}

	public PartyAccount(Long serialNo, String partyId, String accountNum, String partyName, String mobileNum,
			String bankName) {
		super();
		this.serialNo = serialNo;
		this.partyId = partyId;
		this.accountNum = accountNum;
		this.partyName = partyName;
		this.mobileNum = mobileNum;
		this.bankName = bankName;
	}

	public Long getSerialNo() {
		return serialNo;
	}

	public PartyAccount() {
		super();
	}

	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	
}
