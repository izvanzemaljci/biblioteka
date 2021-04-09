package com.etf.iznajmljivanjeknjiga.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "review")
public class ReviewEntity {

	@Id
	private Long _id;
	private Long idIznajmljivanja;
	private Double ocjena;

	public ReviewEntity(Long id, Long idIznajmljivanja, Double ocjena) {
		super();
		this._id = id;
		this.idIznajmljivanja = idIznajmljivanja;
		this.ocjena = ocjena;
	}

	public ReviewEntity() {
		super();
	}

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	public Long getIdIznajmljivanja() {
		return idIznajmljivanja;
	}

	public void setIdIznajmljivanja(Long idIznajmljivanja) {
		this.idIznajmljivanja = idIznajmljivanja;
	}

	public Double getOcjena() {
		return ocjena;
	}

	public void setOcjena(Double ocjena) {
		this.ocjena = ocjena;
	}

}
