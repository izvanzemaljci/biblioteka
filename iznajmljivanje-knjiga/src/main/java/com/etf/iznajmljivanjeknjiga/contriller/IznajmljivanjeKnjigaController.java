package com.etf.iznajmljivanjeknjiga.contriller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etf.iznajmljivanjeknjiga.model.Iznajmljivanje;
import com.etf.iznajmljivanjeknjiga.model.KopijaKnjige;
import com.etf.iznajmljivanjeknjiga.repository.IznajmljivanjeKnjigaRepository;

@RestController
public class IznajmljivanjeKnjigaController {

	@Autowired
	private IznajmljivanjeKnjigaRepository repository;

	@GetMapping("/greeting")
	public KopijaKnjige greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new KopijaKnjige(new Long(1), "Svjetlost", LocalDateTime.now());
	}

	@GetMapping("/get-all-iznajmljivanja")
	public List<Iznajmljivanje> findAll(@RequestParam(value = "name", defaultValue = "World") String name) {
		return repository.findAll();
	}
}
