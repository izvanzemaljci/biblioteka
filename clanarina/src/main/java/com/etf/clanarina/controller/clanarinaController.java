package com.etf.clanarina.controller;

import com.etf.clanarina.errorHandling.ApiException;
import com.etf.clanarina.model.Clanarina;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etf.clanarina.model.Clanarina;
import com.etf.clanarina.model.Korisnik;
import com.etf.clanarina.repository.ClanarinaRepository;
import com.etf.clanarina.repository.KorisnikRepository;

@RestController

public class clanarinaController {
	@Autowired
	private ClanarinaRepository repositoryClanarina;
	@Autowired
	private KorisnikRepository repositoryKorisnik;

	@GetMapping("/clanarina/find")
	public List<Clanarina> findAllClanarina() throws ApiException{
		return repositoryClanarina.findAll();
	}
	
	@GetMapping("/clanarina/find/{id}")
	public Optional<Clanarina> findOneClanarina(@PathVariable final Long id) throws ApiException{
		return repositoryClanarina.findById(id);
	}
	
	
	@PostMapping("/clanarina/create")
	public Clanarina createClanarina(Clanarina clanarina) {
		return repositoryClanarina.insert(clanarina);
	}

	@PutMapping("/clanarina/update/{id}")
	@Transactional
	public Clanarina updateClanarina(@PathVariable final Long id, Clanarina clanarina) {
		Clanarina clanarinaUpdate = repositoryClanarina.findById(id).get();
		clanarinaUpdate.setIdKorisnika(clanarina.getIdKorisnika());
		clanarinaUpdate.setPlatiti(clanarina.getPlatiti());
		clanarinaUpdate.setDatumUpisa(clanarina.getDatumUpisa());
		return repositoryClanarina.save(clanarina);
	}
	@DeleteMapping("/clanarina/delete/{id}")
	@Transactional
	public void deleteClanarina(@PathVariable final Long id) throws ApiException{
		repositoryClanarina.delete(id);
	}
	
	
	
	@GetMapping("/korisnik/find") 
	public List<Korisnik> findAllKorisnik(@RequestParam(value = "name", defaultValue = "World") String name) throws ApiException{
		return repositoryKorisnik.findAll();
	}
	
	@GetMapping("/korisnik/find/{id}")
	public Optional<Korisnik> findOneKorisnik(@PathVariable final Long id) throws ApiException{
		return repositoryKorisnik.findById(id);
	}
	@PostMapping("/korisnik/create")
	public Korisnik createKorisnik(Korisnik korisnik) {
		return repositoryKorisnik.insert(korisnik);
	}

	@PutMapping("/korisnik/update/{id}")
	public Korisnik update(@PathVariable final Long id, Korisnik korisnik) {
		Korisnik korisnikUpdate = repositoryKorisnik.findById(id).get();
		korisnikUpdate.setIme(korisnik.getIme());
		korisnikUpdate.setPrezime(korisnik.getPrezime());
		korisnikUpdate.setDatumRodjenja(korisnik.getDatumRodjenja());
		return repositoryKorisnik.save(korisnik);
	}
	@DeleteMapping("/korisnik/delete/{id}")
	public void deleteKorisnik(@PathVariable final Long id){
		repositoryKorisnik.delete(id);
	}
	
	
	
}
