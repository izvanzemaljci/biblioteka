package com.etf.iznajmljivanjeknjiga;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class KopijaKnjige {

	@Id
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
