package com.etf.editknjiga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.etf.editknjiga.model.Knjiga;

public interface EditKnjigaRepository extends MongoRepository<Knjiga, Long> {

}
