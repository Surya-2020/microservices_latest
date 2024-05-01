package com.microservices.Party.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.Party.Entity.PartyAccount;

@Repository
public interface PartyAccountRepo extends JpaRepository<PartyAccount, Long> {

	
}
