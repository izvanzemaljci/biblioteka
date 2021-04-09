package com.etf.clanarina.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "clanarina")
public class Clanarina {
	
	@Id
	private ObjectId objectId;	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull(message = "IDkorisnika can't be null")
	private Long idKorisnika;
	
	@NotNull(message = "DatumUpisa can't be null")
	private String datumUpisa;
	private Double platiti;
	
	public Clanarina() {
		super();
	}
	public Clanarina(Long id, Long idKorisnika,  String datumUpisa, Double platiti) {
		super();
		this.id = id;
		this.idKorisnika = idKorisnika;
		this.datumUpisa = datumUpisa;
		this.platiti = platiti;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

}
