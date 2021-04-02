package com.etf.editzaposlenika.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.etf.editzaposlenika.model.Zaposlenik;
import com.etf.editzaposlenika.service.EditZaposlenikaService;

@RestController
@RequestMapping(path="/zaposlenici")
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
	
	@GetMapping("/get-by-name/{name}")
	public Zaposlenik getByName(@PathVariable(value = "name") String name) {
		return service.getByName(name);
	}
	
	@GetMapping("/get-by-id/{id_worker}")
	public Zaposlenik getById(@PathVariable(value = "id_worker") Long id_worker) {
		return service.getById(id_worker);
	}
	
	@PutMapping("/edit/{id_worker}")
	public Zaposlenik edit(@PathVariable(value = "id_worker") Long id_worker, @RequestBody Zaposlenik zaposlenik) {
		zaposlenik.setId_worker(id_worker);
		Zaposlenik z = service.edit(zaposlenik);
		return z;
	}
	
	@PostMapping("add-zaposlenik")
	public Zaposlenik addNewZaposlenik(@RequestBody Zaposlenik zaposlenik) {
		service.addNewZaposlenik(zaposlenik);
		return zaposlenik;
	}
	
	@DeleteMapping("/delete/{id_worker}")
 	public void delete(@PathVariable(value = "id_worker") Long id_worker) {
 		service.delete(id_worker);
 	}
}