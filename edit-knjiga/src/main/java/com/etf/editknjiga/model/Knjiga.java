package com.etf.editknjiga.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "knjiga")
public class Knjiga {
	@Id
	private ObjectId objectId;
	public Long id;
	public String naziv;
	public String zanr;
	public Long idAutor;

	public Knjiga() {
		super();
	}

	public Knjiga(Long id, String naziv, String zanr, Long idAutor) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.zanr = zanr;
		this.idAutor = idAutor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public Long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}
}
