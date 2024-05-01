package com.microservices.Party.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservices.Party.Entity.Party;

@Repository
public interface PartyServiceRepo extends JpaRepository<Party, Long>{
	
	@Query("select p from Party p where p.partyId=?1")
	public Party findById(Integer partyId);
	
}
