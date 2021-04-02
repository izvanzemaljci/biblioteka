package com.etf.editzaposlenika.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.etf.editzaposlenika.model.Zaposlenik;

@Repository
public interface EditZaposlenikaRepository extends MongoRepository<Zaposlenik,Long>{

	Zaposlenik findByName(String name);
	
	@Query("{ 'id_worker' : ?0 }")
	Optional<Zaposlenik> findById(Long id_worker);
}
