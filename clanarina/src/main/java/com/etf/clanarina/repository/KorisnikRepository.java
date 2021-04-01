package com.etf.clanarina.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.etf.clanarina.model.Korisnik;

public interface KorisnikRepository extends MongoRepository<Korisnik, Long> {
	
	public List<Korisnik> findAll();
	
	public Korisnik findByObjectId(Long id);
	
	@Query("{'id':?0}")
	public Optional<Korisnik> findById(Long id);
	
	public Korisnik insert(Korisnik clanarina);
	
	@Query("{'id':?0}")
	public void delete(Long id);
	
	@Query("{'id':?0}")
	public Korisnik update(final Long id, Korisnik clanarina);

}
