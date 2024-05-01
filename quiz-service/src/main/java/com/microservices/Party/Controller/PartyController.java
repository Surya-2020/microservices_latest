package com.microservices.Party.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Party.Entity.Party;
import com.microservices.Party.Model.GetPartyWithAccountResponse;
import com.microservices.Party.Model.PartyWithAccountModel;
import com.microservices.Party.Service.IPartyService;

@RestController
@RequestMapping("/api/v1")
public class PartyController {

	@Autowired
	private IPartyService partySvc;
	@Autowired
	MicroService microService;

	@GetMapping("/healthcheck")
	public String healthcheck() {
		return "Party App is running";
	}

	@PostMapping("/saveParty")
	public String saveParty(@RequestBody Party party) {
		return partySvc.saveParty(party);

	}

	@GetMapping("/getParty")
	public Party getParty(@RequestParam(value = "partyId") Integer partyId) {

		Party party = partySvc.findById(partyId);
		return party;
	}

	@GetMapping("/getPartyAndAccount")
	public ResponseEntity<GetPartyWithAccountResponse> getPartyAndAccountInfo(
			@RequestParam(value = "partyId") Integer partyId) {

		return new ResponseEntity<GetPartyWithAccountResponse>(microService.getPartyAndAccountInfo(partyId),
				HttpStatus.OK);
	}

	@PostMapping("/savePartyWiithAccount")
	public String savePartyWithAccount(@RequestBody PartyWithAccountModel model) {

		return microService.savePartyWithAccount(model);
	}

}
