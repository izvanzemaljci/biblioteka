package com.etf.editzaposlenika.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.etf.editzaposlenika.model.Zaposlenik;

@Repository
public interface EditZaposlenikaRepository extends MongoRepository<Zaposlenik,Long>{

	Zaposlenik findByName(String name);
}
