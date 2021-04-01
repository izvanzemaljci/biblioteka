package com.etf.iznajmljivanjeknjiga.contriller;

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

import com.etf.iznajmljivanjeknjiga.dto.IznajmljivanjeRequest;
import com.etf.iznajmljivanjeknjiga.model.IznajmljivanjeEntity;
import com.etf.iznajmljivanjeknjiga.service.IznajmljivanjeKnjigaService;

@RestController
@RequestMapping(path = "/iznajmljivanje-knjiga")
public class IznajmljivanjeKnjigaController {

	@Autowired
	private IznajmljivanjeKnjigaService service;

	@GetMapping()
	public List<IznajmljivanjeEntity> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public IznajmljivanjeEntity findByObjectId(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}

	@PostMapping()
	public IznajmljivanjeEntity create(@RequestBody IznajmljivanjeRequest request) {
		IznajmljivanjeEntity p = service.create(request);
		return p;
	}

	@PutMapping("/{id}")
	public IznajmljivanjeEntity edit(@PathVariable(value = "id") Long id, @RequestBody IznajmljivanjeRequest request) {
		request.setId(id);
		IznajmljivanjeEntity p = service.edit(request);
		return p;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}
}
