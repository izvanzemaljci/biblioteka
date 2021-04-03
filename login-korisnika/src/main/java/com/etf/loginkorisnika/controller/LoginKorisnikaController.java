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
	
	@GetMapping("/get-by-username/{username}")
	public Korisnik getByUsername(@PathVariable(value = "username") String username) {
		return service.getByUsername(username);
	}
	
	@GetMapping("/get-by-id/{id_user}")
	public Korisnik getById(@PathVariable(value = "id_user") Long id_user) {
		return service.getById(id_user);
	}
	
	@PutMapping("/edit/{id_user}")
	public Korisnik edit(@PathVariable(value = "id_user") Long id_user, @RequestBody Korisnik korisnik) {
		korisnik.setId_user(id_user);
		Korisnik k = service.edit(korisnik);
		return k;
	}
	
	@PostMapping("add-korisnik")
	public Korisnik addNewKorisnik(@RequestBody Korisnik korisnik) {
		service.addNewKorisnik(korisnik);
		return korisnik;
	}
	
	@DeleteMapping("/delete/{id_user}")
 	public void delete(@PathVariable(value = "id_user") Long id_user) {
 		service.delete(id_user);
 	}
}
