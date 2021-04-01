package com.etf.iznajmljivanjeknjiga.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.iznajmljivanjeknjiga.dto.IznajmljivanjeRequest;
import com.etf.iznajmljivanjeknjiga.model.IznajmljivanjeEntity;
import com.etf.iznajmljivanjeknjiga.repository.IznajmljivanjeKnjigaRepository;

@Service
public class IznajmljivanjeKnjigaService {

	@Autowired
	private IznajmljivanjeKnjigaRepository iznajmljivanjeKnjigaRepository;

	public List<IznajmljivanjeEntity> findAll() {
		return iznajmljivanjeKnjigaRepository.findAll();
	}

	public IznajmljivanjeEntity findById(Long id) {
		Optional<IznajmljivanjeEntity> r = iznajmljivanjeKnjigaRepository.findById(id);
		return iznajmljivanjeKnjigaRepository.findById(id).orElse(new IznajmljivanjeEntity());
	}

	public IznajmljivanjeEntity create(IznajmljivanjeRequest request) {
		return iznajmljivanjeKnjigaRepository
				.save(new IznajmljivanjeEntity(request.getId(), request.getIdKorisnika(), request.getIdKopijaKnjige(),
						request.getDatumIznajmljivanja(), request.getIdUposlenika(), request.getPlatiti()));

	}

	public IznajmljivanjeEntity edit(IznajmljivanjeRequest request) {
		IznajmljivanjeEntity entity = iznajmljivanjeKnjigaRepository.findById(request.getId())
				.orElse(new IznajmljivanjeEntity());
		if (request.getDatumIznajmljivanja() != null) {
			entity.setDatumIznajmljivanja(LocalDate.parse(request.getDatumIznajmljivanja()));
		}
		if (request.getIdKopijaKnjige() != null) {
			entity.setIdKopijaKnjige(request.getIdKopijaKnjige());
		}
		if (request.getIdKorisnika() != null) {
			entity.setIdKorisnika(request.getIdKorisnika());
		}
		if (request.getIdUposlenika() != null) {
			entity.setIdUposlenika(request.getIdUposlenika());
		}
		if (request.getPlatiti() != null) {
			entity.setPlatiti(request.getPlatiti());
		}
		return iznajmljivanjeKnjigaRepository.save(entity);

	}

	public void delete(Long id) {
		iznajmljivanjeKnjigaRepository
				.delete(iznajmljivanjeKnjigaRepository.findById(id).orElse(new IznajmljivanjeEntity()));

	}
}
