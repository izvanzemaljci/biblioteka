package com.etf.iznajmljivanjeknjiga.validation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.iznajmljivanjeknjiga.dto.IznajmljivanjeRequest;
import com.etf.iznajmljivanjeknjiga.exception.ApiRequestException;
import com.etf.iznajmljivanjeknjiga.feign.LoginFeignClient;
import com.etf.iznajmljivanjeknjiga.feign.ZaposleniciFeignClient;
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

	@Autowired
	private ZaposleniciFeignClient zaposleniciFeignClient;

	@Autowired
	private LoginFeignClient loginFeignClient;

	public void checkIfExists(Long id) {
		if (!repository.existsById(id)) {
			throw new ApiRequestException("Iznjmljivanje knjige with id:" + id + " does not exist.");
		}
	}

	public void validateCreateRequest(IznajmljivanjeRequest request) {
		String errorMessage = "";
		kopijaKnjigeRepository.save(new KopijaKnjigeEntity(3L, 3L, "Svjetlost", LocalDate.now()));
		if (request.getId() < 0L || request.getIdKorisnika() < 0L || request.getIdKopijaKnjige() < 0L
				|| request.getIdUposlenika() < 0L || request.getPlatiti() < 0.0)
			errorMessage += "Numeric values must be greater then 0. /r/n";
		if (request.getIdKorisnika() != null && loginFeignClient.getById(request.getIdKorisnika()) == null) {
			errorMessage += "Korisnik with id:" + request.getIdKopijaKnjige() + " does not exist. /r/n";
		}
		if (request.getIdUposlenika() != null && zaposleniciFeignClient.getById(request.getIdUposlenika()) != null) {
			errorMessage += "Zaposlenik with id:" + request.getIdKopijaKnjige() + " does not exist. /r/n";
		}
		if (!kopijaKnjigeRepository.existsById(request.getIdKopijaKnjige())) {
			errorMessage += "Kopoja Knjige with id:" + request.getIdKopijaKnjige() + " does not exist. /r/n";
		}
		if (validateDate(request.getDatumIznajmljivanja())) {
			errorMessage += "Datum izdavanja is not valid. /r/n";
		}
		if (errorMessage != "") {
			throw new ApiRequestException(errorMessage);
		}

	}

	private boolean validateDate(String date) {
		try {
			LocalDate.parse(date);
			return false;
		} catch (Exception e) {
			return true;
		}
	}

	public void validateEditRequest(IznajmljivanjeRequest request) {
		String errorMessage = "";
		checkIfExists(request.getId());

		if (request.getIdKopijaKnjige() != null && !kopijaKnjigeRepository.existsById(request.getIdKopijaKnjige())) {
			errorMessage += "Kopoja Knjige with id:" + request.getIdKopijaKnjige() + " does not exist. /r/n";
		}
		if (request.getIdKorisnika() != null && loginFeignClient.getById(request.getIdKorisnika()) == null) {
			errorMessage += "Korisnik with id:" + request.getIdKorisnika() + " does not exist. /r/n";
		}
		if (request.getIdUposlenika() != null && zaposleniciFeignClient.getById(request.getIdUposlenika()) == null) {
			errorMessage += "Zaposlenik with id:" + request.getIdUposlenika() + " does not exist. /r/n";
		}
		if (request.getDatumIznajmljivanja() != null && validateDate(request.getDatumIznajmljivanja())) {
			errorMessage += "Datum izdavanja is not valid. /r/n";
		}
		if (request.getPlatiti() != null && request.getPlatiti() < 0.0) {
			errorMessage += "Platiti must be greater then 0. /r/n";
		}
		if (errorMessage != "") {
			throw new ApiRequestException(errorMessage);
		}

	}

}
