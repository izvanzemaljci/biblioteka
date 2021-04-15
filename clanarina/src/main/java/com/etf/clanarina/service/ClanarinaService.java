package com.etf.clanarina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.clanarina.dto.ClanarinaRequest;
import com.etf.clanarina.model.Clanarina;
import com.etf.clanarina.repository.ClanarinaRepository;
import com.etf.clanarina.validation.clanarinaValidator;

@Service
public class ClanarinaService {

	@Autowired
	private ClanarinaRepository ClanarinaRepository;
	@Autowired
	private clanarinaValidator validator;

	public List<Clanarina> findAll() {
		return ClanarinaRepository.findAll();
	}

	public Clanarina findById(Long id) {
		validator.checkIfExists(id);
		return ClanarinaRepository.findById(id).orElse(new Clanarina());
	}

	public Clanarina create(ClanarinaRequest request) {
		validator.validateCreateRequest(request);
		return ClanarinaRepository.save(new Clanarina(request.getId(), request.getIdKorisnika(),
				request.getDatumUpisa(), request.getPlatiti()));

	}

	public Clanarina edit(ClanarinaRequest request) {
		validator.validateEditRequest(request);

		Clanarina entity = ClanarinaRepository.findById(request.getId()).orElse(new Clanarina());
		if (request.getDatumUpisa() != null) {
			entity.setDatumUpisa(request.getDatumUpisa());
		}

		if (request.getIdKorisnika() != null) {
			entity.setIdKorisnika(request.getIdKorisnika());
		}

		if (request.getPlatiti() != null) {
			entity.setPlatiti(request.getPlatiti());
		}
		return ClanarinaRepository.save(entity);

	}

	public void delete(Long id) {
		validator.checkIfExists(id);
		ClanarinaRepository.delete(ClanarinaRepository.findById(id).orElse(new Clanarina()));

	}

}
