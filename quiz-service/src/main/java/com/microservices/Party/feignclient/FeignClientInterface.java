package com.microservices.Party.feignclient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.microservices.Party.Model.Account;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(name = "ACCOUNT-SERVICE", path = "/api/v1")
public interface FeignClientInterface {

	@GetMapping("/getAccountByPartyId")
	@CircuitBreaker(name = "ResiliencyInstance", fallbackMethod = "fallbackAccountSvc")
	public ResponseEntity<List<Account>> getAccountByPartyId(@RequestParam(value = "partyId") Integer partyId);

	@PostMapping("/saveAccount")
	@CircuitBreaker(name = "ResiliencyInstance", fallbackMethod = "fallbackSaveAccount")
	public String saveAccount(@RequestBody List<Account> model);

	public default ResponseEntity<List<Account>> fallbackAccountSvc(Exception ex) {
		Account ac = new Account();
		ac.setAccountNumber("dummy");
		ac.setAccountType("dummyType");
		ac.setBankName("dummy BankName");
		ac.setPartyId(00);

		List<Account> acts = new ArrayList<>();
		acts.add(ac);
		return new ResponseEntity<List<Account>>(acts, HttpStatus.OK);
	}

	public default String fallbackSaveAccount(Exception ex) throws Exception {
		
		throw ex;
		//return "Account not saved successfully";
	}

}
