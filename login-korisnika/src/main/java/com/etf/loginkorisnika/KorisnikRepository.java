package com.etf.loginkorisnika;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KorisnikRepository extends MongoRepository<Korisnik, String> {
}
