package com.etf.editzaposlenika.validation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.editzaposlenika.dto.EditRequest;
import com.etf.editzaposlenika.repository.EditZaposlenikaRepository;
import com.etf.editzaposlenika.exception.ApiRequestException;

@Service
public class EditZaposlenikaValidation {

	private LocalDate passDate = LocalDate.of(1900, 1, 1);
	
	@Autowired
	private EditZaposlenikaRepository repository;
	
	public void checkIfExists(Long _id) {
		if (!repository.existsById(_id)) {
			throw new ApiRequestException("Worker with id:" + _id + " does not exist.");
		}
	}
	
	public void validateCreateRequest(EditRequest request) {
		String errorMessage = "";
		if(request.getId() < 0L || request.getId_user() < 0L)
			errorMessage += "Numeric values must be greater then 0. /r/n";
		if(repository.existsById(request.getId()))
			errorMessage += "Worker with id:" + request.getId() + " already exists. /r/n";
		if(repository.existsById(request.getId_user()))
			errorMessage += "Worker with user id:" + request.getId_user() + " already exists. /r/n";
		if(request.getId() == null)
			errorMessage += "Id must not be null. /r/n";
		if(request.getId_user() == null) 
			errorMessage += "User id must not be null. /r/n";
		if(!validateDate(request.getDateOfBirth())) 
			errorMessage += "Date of birth is not valid. /r/n";
		if(!validateDate(request.getDateOfEmployment()))
			errorMessage += "Date of employment is not valid. /r/n";
		if (errorMessage != "")
			throw new ApiRequestException(errorMessage);
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
	
	public void validateEditRequest(EditRequest request) {
		String errorMessage = "";
		checkIfExists(request.getId());
		if(request.getId() == null && !repository.existsById(request.getId()))
			errorMessage += "Worker with id:" + request.getId() + " does not exist. /r/n";
		if(request.getId_user() == null && !repository.existsById(request.getId_user())) 
			errorMessage += "User with id:" + request.getId_user() + " does not exist. /r/n";
		if(request.getDateOfBirth() == null && !validateDate(request.getDateOfBirth()))
			errorMessage += "Date of birth is not valid. /r/n";
		if(request.getDateOfEmployment() == null && !validateDate(request.getDateOfEmployment()))
			errorMessage += "Date of employment is not valid. /r/n";
		if (errorMessage != "")
			throw new ApiRequestException(errorMessage);
	}
	
}
