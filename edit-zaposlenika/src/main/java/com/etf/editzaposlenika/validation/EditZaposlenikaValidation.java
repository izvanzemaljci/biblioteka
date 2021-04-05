package com.etf.editzaposlenika.validation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.editzaposlenika.dto.EditRequest;
import com.etf.editzaposlenika.repository.EditZaposlenikaRepository;

@Service
public class EditZaposlenikaValidation {

	private LocalDate passDate = LocalDate.of(1900, 1, 1);
	
	@Autowired
	private EditZaposlenikaRepository repository;
	
	public boolean checkIfExists(Long _id) {
		return repository.existsById(_id);
	}
	
	public boolean validateCreateRequest(EditRequest request) {
		if(request.getId() < 0L || request.getId_user() < 0L)
			return false;
		if(checkIfExists(request.getId()))
			return false;
		if(!validateDate(request.getDateOfBirth())) 
			return false;
		if(!validateDate(request.getDateOfEmployment()))
			return false;
		return true;
	}
		
	private boolean validateDate(LocalDate date) {
		boolean valid = true;
        if (date != null) {
            if (!date.isAfter(passDate)) {
                valid = false;
            }
        }
        return valid;
	}
	
	public boolean validateEditRequest(EditRequest request) {
		if(request.getId() == null && !checkIfExists(request.getId()))
			return false;
		if(request.getId_user() == null && !checkIfExists(request.getId_user())) 
			return false;
		if(request.getDateOfBirth() == null && !validateDate(request.getDateOfBirth()))
			return false;
		if(request.getDateOfEmployment() == null && !validateDate(request.getDateOfEmployment()))
			return false;
		return true;
	}
	
}
