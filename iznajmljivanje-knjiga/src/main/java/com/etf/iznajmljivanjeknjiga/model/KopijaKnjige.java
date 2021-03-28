package com.etf.iznajmljivanjeknjiga.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "kopija-knjige")
public class KopijaKnjige {

	@Id
	private ObjectId objectId;
	private Long id;
	private Long idKnjige;
	private String izdavac;
	private LocalDateTime datumIzdavanja;

	public KopijaKnjige() {
		super();
	}

	public KopijaKnjige(Long id, Long idKnjige, String izdavac, LocalDateTime datumIzdavanja) {
		super();
		this.id = id;
		this.idKnjige = idKnjige;
		this.izdavac = izdavac;
		this.datumIzdavanja = datumIzdavanja;
	}

	public KopijaKnjige(Long idKnjige, String izdavac, LocalDateTime datumIzdavanja) {
		super();
		this.idKnjige = idKnjige;
		this.izdavac = izdavac;
		this.datumIzdavanja = datumIzdavanja;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdKnjige() {
		return idKnjige;
	}

	public void setIdKnjige(Long idKnjige) {
		this.idKnjige = idKnjige;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public LocalDateTime getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public void setDatumIzdavanja(LocalDateTime datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

}
