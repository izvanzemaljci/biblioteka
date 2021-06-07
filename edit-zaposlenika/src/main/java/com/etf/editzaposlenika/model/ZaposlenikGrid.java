package com.etf.editzaposlenika.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "edit-zaposlenika")
public class ZaposlenikGrid {
	@Id
	private Long _id;
	private Long id_user;
	private String firstName;
	private String lastName;

	public ZaposlenikGrid() {
	}

	public ZaposlenikGrid(Long _id, Long id_user, String firstName, String lastName) {
		super();
		this._id = _id;
		this.id_user = id_user;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getFirstName() {
		return firstName;
	}

	public void setfirstName(String name) {
		this.firstName = name;
	}

}
