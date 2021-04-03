package com.etf.iznajmljivanjeknjiga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.etf.iznajmljivanjeknjiga.model.IznajmljivanjeEntity;

@Repository
public interface IznajmljivanjeKnjigaRepository extends MongoRepository<IznajmljivanjeEntity, Long> {
//	public List<IznajmljivanjeEntity> findAll();

//	@Query("{ 'id' : ?0 }")
//	public Optional<IznajmljivanjeEntity> findById(int id);
//
//	@Query("{ 'id' : ?0 }")
//	public boolean existsById(Long id);

}
