package com.etf.loginkorisnika.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.etf.loginkorisnika.model.Korisnik;

@Repository
public interface LoginKorisnikaRepository extends MongoRepository<Korisnik, Long> {

	Korisnik findByUsername(String username);
}
