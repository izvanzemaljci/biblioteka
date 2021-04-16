package com.etf.editzaposlenika.controller;

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

import com.etf.editzaposlenika.dto.EditRequest;
import com.etf.editzaposlenika.dto.Korisnik;
import com.etf.editzaposlenika.model.Zaposlenik;
import com.etf.editzaposlenika.service.EditZaposlenikaService;

@RestController
@RequestMapping(path = "/zaposlenici")
public class EditZaposlenikaController {

	private final EditZaposlenikaService service;

	@Autowired
	public EditZaposlenikaController(EditZaposlenikaService service) {
		this.service = service;
	}

	@GetMapping()
	public List<Zaposlenik> getAll() {
		return service.getAll();
	}

	@GetMapping("/login")
	public List<Korisnik> login() {
		return service.login();
	}

	@GetMapping("/n/{name}")
	public Zaposlenik getByName(@PathVariable(value = "name") String name) {
		return service.getByName(name);
	}

	@GetMapping("/{id}")
	public Zaposlenik getById(@PathVariable(value = "id") Long id) {
		return service.getById(id);
	}

	@PutMapping("/{id}")
	public Zaposlenik edit(@PathVariable(value = "id") Long id, @RequestBody EditRequest request) {
		request.setId(id);
		Zaposlenik z = service.edit(request);
		return z;
	}

	@PostMapping()
	public Zaposlenik addNewZaposlenik(@RequestBody EditRequest request) {
		Zaposlenik z = service.addNewZaposlenik(request);
		return z;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}
}