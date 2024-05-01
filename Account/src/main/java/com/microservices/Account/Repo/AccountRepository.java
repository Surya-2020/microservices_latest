package com.microservices.Account.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservices.Account.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	@Query(value = "SELECT a From Account a where a.accountNumber=?1 ")
	public Account findById(String accountNumber);
	
	@Query(value = "SELECT a From Account a where a.keyAccount=?1 ")
	public Account findByKeyAcct(String keyAcct);
	
	@Query(value = "SELECT a From Account a where a.partyId=?1 ")
	public List<Account> findByPartyId(Integer partyId);

}
