package com.etf.editknjiga.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "autor")
public class Autor {

	@Id

	public Long _id;
	public String ime;
	public String prezime;
	public String opis;

	public Autor() {
		super();
	}

	public Autor(Long id, String ime, String prezime, String opis) {
		super();
		this._id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.opis = opis;
	}

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}
