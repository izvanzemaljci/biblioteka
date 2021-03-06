package com.etf.editknjiga.controller;

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

import com.etf.editknjiga.model.Knjiga;
import com.etf.editknjiga.service.EditKnjigaService;

@RestController
@RequestMapping(path = "/edit-knjiga")
public class EditKnjigaController {
	

	@Autowired
	private EditKnjigaService service;
	
	@GetMapping()
	public List<Knjiga> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Knjiga findByObjectId(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}

	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}
	

}
