package com.etf.clanarina.controller;

import com.etf.clanarina.dto.ClanarinaRequest;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.etf.clanarina.service.ClanarinaService;

@RestController
@RequestMapping(path = "/clanarina")
public class clanarinaController {
	@Autowired
	private ClanarinaService service;
	
	@GetMapping("/find")
	public List<Clanarina> findAll() throws ApiException{
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Clanarina findByObjectId(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	
	@PostMapping()
	public Clanarina create(@RequestBody ClanarinaRequest  request) {
		Clanarina p = service.create(request);
		return p;
	}

	@PutMapping("/{id}")
	public Clanarina edit(@PathVariable(value = "id") Long id, @RequestBody ClanarinaRequest request) {
		request.setId(id);
		Clanarina p = service.edit(request);
		return p;
	}
	@DeleteMapping("/{id}")
	@Transactional
	public void deleteClanarina(@PathVariable final Long id) throws ApiException{
		service.delete(id);
	}
	
	
	
	
}
