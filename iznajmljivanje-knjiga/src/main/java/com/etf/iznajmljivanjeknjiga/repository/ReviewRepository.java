package com.etf.iznajmljivanjeknjiga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.etf.iznajmljivanjeknjiga.model.ReviewEntity;

public interface ReviewRepository extends MongoRepository<ReviewEntity, Long> {
//	@Query("{ 'id' : ?0 }")
//	boolean existsById(Long id);
}
