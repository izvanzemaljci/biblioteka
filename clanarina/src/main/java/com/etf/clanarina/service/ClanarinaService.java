package com.etf.clanarina.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.clanarina.dto.ClanarinaRequest;
import com.etf.clanarina.model.Clanarina;
import com.etf.clanarina.repository.ClanarinaRepository;

@Service
public class ClanarinaService {

	@Autowired
	private ClanarinaRepository ClanarinaRepository;

	public List<Clanarina> findAll() {
		return ClanarinaRepository.findAll();
	}

	public Clanarina findById(Long id) {
		Optional<Clanarina> r = ClanarinaRepository.findById(id);
		return ClanarinaRepository.findById(id).orElse(new Clanarina());
	}

	public Clanarina create(ClanarinaRequest request) {
		return ClanarinaRepository.save(new Clanarina(request.getId(), request.getIdKorisnika(), request.getDatumUpisa(), request.getPlatiti()));

	}

	public Clanarina edit(ClanarinaRequest request) {
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
		ClanarinaRepository
				.delete(ClanarinaRepository.findById(id).orElse(new Clanarina()));

	}
}
