package com.etf.editzaposlenika.dto;

import java.time.LocalDate;

public class EditRequest {
	private Long _id;
	private Long id_user;
	private String name;
	private LocalDate dateOfBirth;
	private LocalDate dateOfEmployment;

	public EditRequest() {
	}

	public EditRequest(Long _id, Long id_user, String name, LocalDate dateOfBirth, LocalDate dateOfEmployment) {
		super();
		this._id = _id;
		this.id_user = id_user;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.dateOfEmployment = dateOfEmployment;
	}

	public Long getId() {
		return _id;
	}

	public void setId(Long _id) {
		this._id = _id;
	}

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(LocalDate dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}
}
