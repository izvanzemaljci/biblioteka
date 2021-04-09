package com.etf.loginkorisnika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.loginkorisnika.dto.LoginRequest;
import com.etf.loginkorisnika.model.Korisnik;
import com.etf.loginkorisnika.repository.LoginKorisnikaRepository;
import com.etf.loginkorisnika.validation.LoginKorisnikaValidation;

@Service
public class LoginKorisnikaService {

	private final LoginKorisnikaRepository repository;
	
	@Autowired
	private LoginKorisnikaValidation validation;
	
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

	public Korisnik getById(Long _id) {
		return repository.findById(_id).orElse(new Korisnik());
	}

	public Korisnik addNewKorisnik(LoginRequest request) {
		validation.validateCreateRequest(request);
		return repository.save(new Korisnik(request.getId(), request.getUsername(), request.getPassword(), request.getRole()));
	}

	public void delete(Long _id) {
		validation.checkIfExists(_id);
		repository.delete(repository.findById(_id).orElse(new Korisnik()));
	}

	public Korisnik edit(LoginRequest request) {
		validation.validateEditRequest(request);
		Korisnik k = repository.findById(request.getId())
 				.orElse(new Korisnik());
		if(request.getPassword() != null) {
			k.setPassword(request.getPassword());
		}
		if(request.getUsername() != null) {
			k.setUsername(request.getUsername());
		}
		if(request.getId() != null) {
			k.setId(request.getId());
		}
		if(request.getRole() != null) {
			k.setRole(request.getRole());
		}
 		return repository.save(k);	
	}
	
}
