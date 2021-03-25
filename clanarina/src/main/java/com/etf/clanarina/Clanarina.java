package com.etf.clanarina;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
public class Clanarina {
	@Id
	private Long id;
	private Long idKorisnika;
	private LocalDateTime datumUpisa;
	private Double platiti;
	
	public Clanarina() {
		super();
	}
	public Clanarina(Long id, Long idKorisnika,  LocalDateTime datumUpisa, Double platiti) {
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
	public LocalDateTime getDatumUpisa() {
		return datumUpisa;
	}
	public void setDatumUpisa(LocalDateTime datumUpisa) {
		this.datumUpisa = datumUpisa;
	}	
	public Double getPlatiti() {
		return platiti;
	}
	public void setPlatiti(Double platiti) {
		this.platiti = platiti;
	}

}
