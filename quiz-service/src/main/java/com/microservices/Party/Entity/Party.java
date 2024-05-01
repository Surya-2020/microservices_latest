package com.microservices.Party.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serialNumber;
	private Integer partyId;
	private String partyName;
	private String mobileNumber;
	private String role;

	
	

	public Party(Long serialNumber, Integer partyId, String partyName, String mobileNumber, String role) {
		super();
		this.serialNumber = serialNumber;
		this.partyId = partyId;
		this.partyName = partyName;
		this.mobileNumber = mobileNumber;
		this.role = role;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getPartyId() {
		return partyId;
	}

	public void setPartyId(Integer partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	

	
	

	@Override
	public String toString() {
		return "Party [serialNumber=" + serialNumber + ", partyId=" + partyId + ", partyName=" + partyName
				+ ", mobileNumber=" + mobileNumber + ", role=" + role + "]";
	}

	public Party() {
		super();
	}

}
