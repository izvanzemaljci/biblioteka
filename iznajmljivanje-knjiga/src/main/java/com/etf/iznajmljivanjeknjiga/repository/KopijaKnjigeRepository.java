package com.etf.iznajmljivanjeknjiga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.etf.iznajmljivanjeknjiga.model.KopijaKnjigeEntity;

public interface KopijaKnjigeRepository extends MongoRepository<KopijaKnjigeEntity, Long> {

}
