package com.etf.clanarina.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "clanarina")
public class Clanarina {

	@Id
	private Long _id;

	@NotNull(message = "IDkorisnika can't be null")
	private Long idKorisnika;

	@NotNull(message = "DatumUpisa can't be null")
	private String datumUpisa;
	private Double platiti;

	public Clanarina() {
		super();
	}

	public Clanarina(Long id, Long idKorisnika, String datumUpisa, Double platiti) {
		super();
		this._id = id;
		this.idKorisnika = idKorisnika;
		this.datumUpisa = datumUpisa;
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

	public String getDatumUpisa() {
		return datumUpisa;
	}

	public void setDatumUpisa(String datumUpisa) {
		this.datumUpisa = datumUpisa;
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
		Clanarina that = (Clanarina) o;
		return _id.equals(that._id) && idKorisnika.equals(that.idKorisnika)
				&& datumUpisa.equals(that.datumUpisa)
				&& platiti.equals(that.platiti);
	}

}
