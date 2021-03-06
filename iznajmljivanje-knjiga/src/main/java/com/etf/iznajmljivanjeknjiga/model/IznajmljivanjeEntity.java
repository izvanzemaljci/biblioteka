package com.etf.iznajmljivanjeknjiga.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "iznajmljivanje-knjiga")
public class IznajmljivanjeEntity {
	@Id
	private Long _id;
	private Long idKorisnika;
	private Long idKopijaKnjige;
	private LocalDate datumIznajmljivanja;
	private Long idUposlenika;
	private Double platiti;

	public IznajmljivanjeEntity() {
		super();
	}

	public IznajmljivanjeEntity(Long id, Long idKorisnika, Long idKopijaKnjige, String datumIznajmljivanja,
			Long idUposlenika, Double platiti) {
		super();
		this._id = id;
		this.idKorisnika = idKorisnika;
		this.idKopijaKnjige = idKopijaKnjige;
		this.datumIznajmljivanja = LocalDate.parse(datumIznajmljivanja);
		this.idUposlenika = idUposlenika;
		this.platiti = platiti;
	}

	public IznajmljivanjeEntity(Long id, Long idKorisnika, Long idKopijaKnjige, LocalDate datumIznajmljivanja,
			Long idUposlenika, Double platiti) {
		super();
		this._id = id;
		this.idKorisnika = idKorisnika;
		this.idKopijaKnjige = idKopijaKnjige;
		this.datumIznajmljivanja = datumIznajmljivanja;
		this.idUposlenika = idUposlenika;
		this.platiti = platiti;
	}

	public IznajmljivanjeEntity(Long idKorisnika, Long idKopijaKnjige, String datumIznajmljivanja, Long idUposlenika,
			Double platiti) {
		super();
		this.idKorisnika = idKorisnika;
		this.idKopijaKnjige = idKopijaKnjige;
		this.datumIznajmljivanja = LocalDate.parse(datumIznajmljivanja);
		this.idUposlenika = idUposlenika;
		this.platiti = platiti;
	}

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	public Long getIdKorisnika() {
		return idKorisnika;
	}

	public void setIdKorisnika(Long idKorisnika) {
		this.idKorisnika = idKorisnika;
	}

	public Long getIdKopijaKnjige() {
		return idKopijaKnjige;
	}

	public void setIdKopijaKnjige(Long idKopijaKnjige) {
		this.idKopijaKnjige = idKopijaKnjige;
	}

	public LocalDate getDatumIznajmljivanja() {
		return datumIznajmljivanja;
	}

	public void setDatumIznajmljivanja(LocalDate datumIznajmljivanja) {
		this.datumIznajmljivanja = datumIznajmljivanja;
	}

	public Long getIdUposlenika() {
		return idUposlenika;
	}

	public void setIdUposlenika(Long idUposlenika) {
		this.idUposlenika = idUposlenika;
	}

	public Double getPlatiti() {
		return platiti;
	}

	public void setPlatiti(Double platiti) {
		this.platiti = platiti;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		IznajmljivanjeEntity that = (IznajmljivanjeEntity) o;
		return _id.equals(that._id) && idKorisnika.equals(that.idKorisnika)
				&& idKopijaKnjige.equals(that.idKopijaKnjige) && datumIznajmljivanja.equals(that.datumIznajmljivanja)
				&& idUposlenika.equals(that.idUposlenika) && platiti.equals(that.platiti);
	}
}
