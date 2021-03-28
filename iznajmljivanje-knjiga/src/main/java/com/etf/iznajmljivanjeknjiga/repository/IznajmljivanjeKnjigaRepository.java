package com.etf.iznajmljivanjeknjiga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.etf.iznajmljivanjeknjiga.model.Iznajmljivanje;

public interface IznajmljivanjeKnjigaRepository extends MongoRepository<Iznajmljivanje, Long> {

}
