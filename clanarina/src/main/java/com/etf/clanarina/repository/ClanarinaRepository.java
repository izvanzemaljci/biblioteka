package com.etf.clanarina.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.etf.clanarina.model.Clanarina;
import com.etf.clanarina.model.Korisnik;

public interface ClanarinaRepository extends MongoRepository<Clanarina, Long>{
	/*public List<Clanarina> findAll();
	
	public Clanarina findByObjectId(Long id);
	
	@Query("{'id':?0}")
	public Optional<Clanarina> findById(Long id);
	
	public Clanarina insert(Clanarina clanarina);
	
	@Query("{'id':?0}")
	public void delete(Long id);
	
	@Query("{'id':?0}")
	public Clanarina update(final Long id, Clanarina clanarina);*/	

}
