package com.etf.loginkorisnika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etf.loginkorisnika.dto.LoginRequest;
import com.etf.loginkorisnika.model.Korisnik;
import com.etf.loginkorisnika.service.LoginKorisnikaService;

@RestController
@RequestMapping(path="/login")
public class LoginKorisnikaController {
	
	private final LoginKorisnikaService service;
	
	@Autowired
	public LoginKorisnikaController(LoginKorisnikaService service) {
		this.service = service;
	}
	
	@GetMapping()
	public List<Korisnik> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/u/{username}")
	public Korisnik getByUsername(@PathVariable(value = "username") String username) {
		return service.getByUsername(username);
	}
	
	@GetMapping("/{id}")
	public Korisnik getById(@PathVariable(value = "id") Long id) {
		return service.getById(id);
	}
	
	@PutMapping("/{id}")
	public Korisnik edit(@PathVariable(value = "id") Long id, @RequestBody LoginRequest request) {
		request.setId(id);
		Korisnik k = service.edit(request);
		return k;
	}
	
	@PostMapping()
	public Korisnik addNewKorisnik(@RequestBody LoginRequest request) {
		Korisnik k = service.addNewKorisnik(request);
		return k;
	}
	
	@DeleteMapping("/{id}")
 	public void delete(@PathVariable(value = "id") Long id) {
 		service.delete(id);
 	}
}
