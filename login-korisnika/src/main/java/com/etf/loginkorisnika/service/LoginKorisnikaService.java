package com.etf.loginkorisnika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.loginkorisnika.model.Korisnik;
import com.etf.loginkorisnika.repository.LoginKorisnikaRepository;

@Service
public class LoginKorisnikaService {

	private final LoginKorisnikaRepository repository;
	
	@Autowired
	public LoginKorisnikaService(LoginKorisnikaRepository repository) {
		this.repository = repository;
	}

	public List<Korisnik> getAll() {
		return repository.findAll();
	}

	public Korisnik getByUsername(String username) {
		return repository.findByUsername(username);
	}

	public Korisnik getById(Long id) {
		return repository.findById(id).orElse(new Korisnik());
	}

	public void addNewKorisnik(Korisnik korisnik) {
		repository.save(korisnik);
	}

	public void delete(Long id_user) {
		repository.delete(repository.findById(id_user).orElse(new Korisnik()));
	}

	public Korisnik edit(Korisnik korisnik) {
		Korisnik k = repository.findById(korisnik.getId_user())
 				.orElse(new Korisnik());
		if(korisnik.getPassword() != null) {
			k.setPassword(korisnik.getPassword());
		}
		if(korisnik.getUsername() != null) {
			k.setUsername(korisnik.getUsername());
		}
		if(korisnik.getId_user() != null) {
			k.setId_user(korisnik.getId_user());
		}
		if(korisnik.getRole() != null) {
			k.setRole(korisnik.getRole());
		}
 		return repository.save(k);	
	}
	
}
