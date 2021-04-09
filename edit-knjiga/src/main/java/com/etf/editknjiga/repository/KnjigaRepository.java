package com.etf.editknjiga.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.etf.editknjiga.model.Knjiga;

public interface KnjigaRepository extends MongoRepository<Knjiga, Long>{
public List<Knjiga> findAll();
	
	public Knjiga findByObjectId(Long id);
	
	@Query("{'id':?0}")
	public Optional<Knjiga> findById(Long id);
	
	public Knjiga insert(Knjiga editknjiga);
	
	@Query("{'id':?0}")
	public void delete(Long id);
	
	@Query("{'id':?0}")
	public Knjiga update(final Long id, Knjiga editknjiga);


}



	
	
