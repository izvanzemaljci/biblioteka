package com.etf.editknjiga.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "knjiga-extended")
public class KnjigaExtended {
	@Id
	private ObjectId objectId;
	public Long id;
	public String naziv;
	public String zanr;
	public String autor;
	public String status;

	public KnjigaExtended() {
		super();
	}

	public KnjigaExtended(Long id, String naziv, String zanr, String autor) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.zanr = zanr;
		this.autor = autor;
	}

	public KnjigaExtended(Long id, String naziv, String zanr) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.zanr = zanr;

	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setStatus(String status) {

		this.status = status;
	}

}
