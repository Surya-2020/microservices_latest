package com.microservices.Account.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.microservices.Account.Repo.AccountRepository;
import com.microservices.Account.Service.IAccountService;
import com.microservices.Account.Entity.Account;


@Service
public class IAccountServiceImpl implements IAccountService{

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public String saveAccount(List<Account> model) {
		accountRepository.saveAll(model);
		return "Account Saved Successfully";
	}

	@Override
	public Account findByKeyAcct(String keyAcct) {
		
		return accountRepository.findByKeyAcct(keyAcct);
	}
	
	@Override
	public Account findById(String actNum) {
		
		return accountRepository.findById(actNum);
	}

	@Override
	public List<Account> findByPartyId(Integer partyId) {
		return accountRepository.findByPartyId(partyId);
	}

}
