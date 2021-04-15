package com.etf.clanarina.validation;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.clanarina.dto.ClanarinaRequest;
import com.etf.clanarina.exception.ApiRequestException;
import com.etf.clanarina.repository.ClanarinaRepository;
import com.etf.clanarina.repository.KorisnikRepository;

@Service
public class clanarinaValidator {
	
	@Autowired
	private ClanarinaRepository repository;
	
	@Autowired
	private KorisnikRepository korisnikRepository;
	public void checkIfExists(Long id) {
		if (!repository.existsById(id)) {
			throw new ApiRequestException("Iznjmljivanje knjige with id:" + id + " does not exist.");
		}
	}

	
	public void validateRequest(ClanarinaRequest request) {
		Pattern pattern= Pattern.compile("(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)");
		Matcher matcher=pattern.matcher(request.getDatumUpisa());
		if( !matcher.find())
			throw new ApiRequestException("DatumUpisa not valid format");
		
	}
	
	public void validateCreateRequest(ClanarinaRequest request) {
		String errorMessage = "";
		if (request.getId() < 0L || request.getIdKorisnika() < 0L || request.getId() < 0L
				|| request.getPlatiti() < 0.0)
			errorMessage += "Numeric values must be greater then 0. /r/n";
		if (!korisnikRepository.existsById(request.getIdKorisnika())) {
			errorMessage += "Kopoja Knjige with id:" + request.getIdKorisnika() + " does not exist. /r/n";
		}
		if (validateDate(request.getDatumUpisa())) {
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

	public void validateEditRequest(ClanarinaRequest request) {
		String errorMessage = "";
		checkIfExists(request.getId());

		if (request.getIdKorisnika() != null && !korisnikRepository.existsById(request.getIdKorisnika())) {
			errorMessage += "Kopoja Knjige with id:" + request.getIdKorisnika() + " does not exist. /r/n";
		}
		if (request.getDatumUpisa() != null && validateDate(request.getDatumUpisa())) {
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
