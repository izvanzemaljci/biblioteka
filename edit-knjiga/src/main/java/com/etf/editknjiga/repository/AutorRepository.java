package com.etf.editknjiga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.etf.editknjiga.model.Autor;

public interface AutorRepository extends MongoRepository<Autor, Long> {

//	public List<Autor> findAll();
//	
//	//public Autor findByObjectId(Long id);
//	
//	@Query("{'id':?0}")
//	public Optional<Autor> findById(Long id);
//	
//	public Autor insert(Autor editknjiga);
//	
//	@Query("{'id':?0}")
//	public void delete(Long id);
//	
//	@Query("{'id':?0}")
//	public Autor update(final Long id, Autor editknjiga);

}
