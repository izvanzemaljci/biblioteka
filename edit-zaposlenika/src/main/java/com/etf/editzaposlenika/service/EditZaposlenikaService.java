package com.etf.editzaposlenika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.editzaposlenika.dto.EditRequest;
import com.etf.editzaposlenika.exception.ApiRequestException;
import com.etf.editzaposlenika.model.Zaposlenik;
import com.etf.editzaposlenika.repository.EditZaposlenikaRepository;
import com.etf.editzaposlenika.validation.EditZaposlenikaValidation;

@Service
public class EditZaposlenikaService {

	private final EditZaposlenikaRepository repository;

	@Autowired
	private EditZaposlenikaValidation validation;

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

	public Zaposlenik getById(Long _id) {
		validation.checkIfExists(_id);
		return repository.findById(_id).orElse(new Zaposlenik());
	}

	public Zaposlenik addNewZaposlenik(EditRequest request) {
		validation.validateCreateRequest(request);
		return repository.save(new Zaposlenik(request.getId(), request.getId_user(), request.getName(), request.getDateOfBirth(), request.getDateOfEmployment()));	
	}

	public Zaposlenik edit(EditRequest request) {
		validation.validateEditRequest(request);
			Zaposlenik z = repository.findById(request.getId()).orElse(new Zaposlenik());
			if (request.getDateOfBirth() != null) {
				z.setDateOfBirth(request.getDateOfBirth());
			}
			if (request.getDateOfEmployment() != null) {
				z.setDateOfEmployment(request.getDateOfEmployment());
			}
			if (request.getName() != null) {
				z.setName(request.getName());
			}
			if (request.getId_user() != null) {
				z.setId_user(request.getId_user());
			}
			if (request.getId() != null) {
				z.setId(request.getId());
			}
			return repository.save(z);
	}

	public void delete(Long _id) {
		validation.checkIfExists(_id);
		repository.delete(repository.findById(_id).orElse(new Zaposlenik()));
	}
}
