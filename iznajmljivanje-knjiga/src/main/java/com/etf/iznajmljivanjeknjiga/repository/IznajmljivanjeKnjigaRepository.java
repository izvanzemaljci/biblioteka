package com.etf.iznajmljivanjeknjiga.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.etf.iznajmljivanjeknjiga.model.IznajmljivanjeEntity;

public interface IznajmljivanjeKnjigaRepository extends MongoRepository<IznajmljivanjeEntity, Long> {
	public List<IznajmljivanjeEntity> findAll();

	@Query("{ 'id' : ?0 }")
	public Optional<IznajmljivanjeEntity> findById(Long id);

}
