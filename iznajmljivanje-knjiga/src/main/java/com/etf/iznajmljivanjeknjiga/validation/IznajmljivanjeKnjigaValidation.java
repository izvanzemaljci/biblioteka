package com.etf.iznajmljivanjeknjiga.validation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.iznajmljivanjeknjiga.dto.IznajmljivanjeRequest;
import com.etf.iznajmljivanjeknjiga.model.KopijaKnjigeEntity;
import com.etf.iznajmljivanjeknjiga.repository.IznajmljivanjeKnjigaRepository;
import com.etf.iznajmljivanjeknjiga.repository.KopijaKnjigeRepository;
import com.etf.iznajmljivanjeknjiga.repository.ReviewRepository;

@Service
public class IznajmljivanjeKnjigaValidation {
	@Autowired
	private IznajmljivanjeKnjigaRepository repository;

	@Autowired
	private KopijaKnjigeRepository kopijaKnjigeRepository;

	@Autowired
	private ReviewRepository reviewRepository;

	public boolean checkIfExists(Long id) {
		return repository.existsById(id);
	}

	public boolean validateCreateRequest(IznajmljivanjeRequest request) {
		kopijaKnjigeRepository.save(new KopijaKnjigeEntity(3L, 3L, "Svjetlost", LocalDate.now()));
		if (request.getIdKorisnika() < 0L || request.getIdKopijaKnjige() < 0L || request.getIdUposlenika() < 0L
				|| request.getPlatiti() < 0.0)
			return false;
		if (!kopijaKnjigeRepository.existsById(request.getIdKopijaKnjige())) {
			return false;
		}
		if (validateDate(request.getDatumIznajmljivanja())) {
			return false;
		}
		return true;
	}

	private boolean validateDate(String date) {
		try {
			LocalDate.parse(date);
			return false;
		} catch (Exception e) {
			return true;
		}
	}

	public boolean validateEditRequest(IznajmljivanjeRequest request) {
		if (!checkIfExists(request.getId())) {
			return false;
		}
		if (request.getIdKopijaKnjige() != null && !kopijaKnjigeRepository.existsById(request.getIdKopijaKnjige())) {
			return false;
		}
		if (request.getDatumIznajmljivanja() != null && validateDate(request.getDatumIznajmljivanja())) {
			return false;
		}
		if (request.getPlatiti() != null && request.getPlatiti() < 0.0) {
			return false;
		}
		return true;
	}

}
