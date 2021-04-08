package com.etf.loginkorisnika.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.loginkorisnika.dto.LoginRequest;
import com.etf.loginkorisnika.exception.ApiRequestException;
import com.etf.loginkorisnika.repository.LoginKorisnikaRepository;

@Service
public class LoginKorisnikaValidation {
	
	@Autowired
	private LoginKorisnikaRepository repository;
	
	public void checkIfExists(Long _id) {
		if (!repository.existsById(_id)) {
			throw new ApiRequestException("User with id:" + _id + " does not exist.");
		}
	}
	
	public void validateCreateRequest(LoginRequest request) {
		String errorMessage = "";
		if(request.getId() < 0L)
			errorMessage += "Numeric values must be greater then 0. /r/n";
		if(repository.existsById(request.getId()))
			errorMessage += "User with id:" + request.getId() + " already exists. /r/n";
		if(request.getId() == null)
			errorMessage += "Id must not be null. /r/n";
		if(request.getUsername() == "")
			errorMessage += "Username must not be empty. /r/n";
		if(request.getPassword() == "")
			errorMessage += "Password must not be empty. /r/n";
		if(request.getRole() < 0L || request.getRole() > 1L)
			errorMessage += "Invalid role value. /r/n";
		if (errorMessage != "")
			throw new ApiRequestException(errorMessage);
	}
	
	public void validateEditRequest(LoginRequest request) {
		String errorMessage = "";
		checkIfExists(request.getId());
		if(request.getId() != null && !repository.existsById(request.getId()))
			errorMessage += "User with id:" + request.getId() + " does not exist. /r/n";
		if(request.getUsername() == "")
			errorMessage += "Username must not be empty. /r/n";
		if(request.getPassword() == "")
			errorMessage += "Password must not be empty. /r/n";
		if(request.getRole() == null)
			errorMessage += "Role must not be empty. /r/n";
		if(request.getRole() < 0L || request.getRole() > 1L)
			errorMessage += "Invalid role value. /r/n";
		if (errorMessage != "")
			throw new ApiRequestException(errorMessage);
	}

}
