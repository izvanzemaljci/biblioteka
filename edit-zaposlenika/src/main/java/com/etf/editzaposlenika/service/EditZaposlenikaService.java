package com.etf.editzaposlenika.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.editzaposlenika.model.Zaposlenik;
import com.etf.editzaposlenika.repository.EditZaposlenikaRepository;

@Service
public class EditZaposlenikaService {
	
	private final EditZaposlenikaRepository repository;
	
	@Autowired
	public EditZaposlenikaService(EditZaposlenikaRepository repository) {
		this.repository = repository;
	}
	
	public List<Zaposlenik> getAll() {
		return repository.findAll();
	}
	
	public Zaposlenik getByName(String name) {
		return repository.findByName(name);
	}
	
	public Zaposlenik getById(Long id_worker) {
 		return repository.findById(id_worker).orElse(new Zaposlenik());
	}
	
	public void addNewZaposlenik(Zaposlenik zaposlenik) {
		repository.save(zaposlenik);
	}

	public Zaposlenik edit(Zaposlenik zaposlenik) {
		Zaposlenik z = repository.findById(zaposlenik.getId_worker())
 				.orElse(new Zaposlenik());
		if(zaposlenik.getDateOfBirth() != null) {
			z.setDateOfBirth(zaposlenik.getDateOfBirth());
		}
		if(zaposlenik.getDateOfEmployment() != null) {
			z.setDateOfEmployment(zaposlenik.getDateOfEmployment());
		}
		if(zaposlenik.getName() != null) {
			z.setName(zaposlenik.getName());
		}
		if(zaposlenik.getId_user() != null) {
			z.setId_user(zaposlenik.getId_user());
		}
		if(zaposlenik.getId_worker() != null) {
			z.setId_worker(zaposlenik.getId_worker());
		}
 		return repository.save(z);	
 	}

	public void delete(Long id_worker) {
		repository.delete(repository.findById(id_worker).orElse(new Zaposlenik()));
	}
}
