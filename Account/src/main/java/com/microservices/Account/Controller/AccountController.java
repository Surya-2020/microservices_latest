package com.microservices.Account.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Account.Entity.Account;
import com.microservices.Account.Service.IAccountService;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

	@Autowired
	private IAccountService accountService;

	@GetMapping("/healthcheck")
	public String healthCheck() {
		return "Account App is running";
	}

	@PostMapping("/saveAccount")
	public String saveAccount(@RequestBody List<Account> model) {
		return accountService.saveAccount(model);
	}

	@GetMapping("/getAccount")
	public Account getAccount(@RequestParam(value = "actNum") String accountNumber) {
		return accountService.findById(accountNumber);
	}
	
	@GetMapping("/getAccountByKeyAct")
	public Account getAccountByKeyAcct(@RequestParam(value = "keyAccount") String keyAcct) {
		return accountService.findByKeyAcct(keyAcct);
		/*return new ResponseEntity<Account>(act, HttpStatus.OK);*/
	}
	
	@GetMapping("/getAccountByPartyId")
	public ResponseEntity<List<Account>> getAccountByPartyId(@RequestParam(value = "partyId") Integer partyId) {
		    List<Account> acts= accountService.findByPartyId(partyId);
		    return new ResponseEntity<List<Account>>(acts, HttpStatus.OK);
	}
}
