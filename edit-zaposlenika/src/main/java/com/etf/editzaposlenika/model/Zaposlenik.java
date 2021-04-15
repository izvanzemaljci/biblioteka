package com.etf.editzaposlenika.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Document(collection="edit-zaposlenika")
public class Zaposlenik {
	@Id
	private Long _id;
	private Long id_user;
	private String name;
	
    @JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfBirth;
    @JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfEmployment;

	public Zaposlenik() {
	}

	public Zaposlenik(Long _id, Long id_user, String name, LocalDate dateOfBirth, LocalDate dateOfEmployment) {
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

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Zaposlenik))
			return false;
		Zaposlenik zaposlenik = (Zaposlenik) o;
		return Objects.equals(this._id, zaposlenik._id) && Objects.equals(this.name, zaposlenik.name)
				&& Objects.equals(this.dateOfBirth, zaposlenik.dateOfBirth);
	}

	@Override
	public String toString() {
		return "Zaposlenik, id= " + _id + ", ime=" + name;
	}
}
