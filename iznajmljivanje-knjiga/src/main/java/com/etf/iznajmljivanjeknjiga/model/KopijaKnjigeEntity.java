package com.etf.iznajmljivanjeknjiga.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "kopija-knjige")
public class KopijaKnjigeEntity {

	@Id
	private ObjectId objectId;
	private Long id;
	private Long idKnjige;
	private String izdavac;
	private LocalDate datumIzdavanja;

	public KopijaKnjigeEntity() {
		super();
	}

	public KopijaKnjigeEntity(Long id, Long idKnjige, String izdavac, LocalDate datumIzdavanja) {
		super();
		this.id = id;
		this.idKnjige = idKnjige;
		this.izdavac = izdavac;
		this.datumIzdavanja = datumIzdavanja;
	}

	public KopijaKnjigeEntity(Long idKnjige, String izdavac, LocalDate datumIzdavanja) {
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

	public LocalDate getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public void setDatumIzdavanja(LocalDate datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

}
