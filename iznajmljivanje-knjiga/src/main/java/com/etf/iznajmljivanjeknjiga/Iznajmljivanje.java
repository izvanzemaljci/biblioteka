package com.etf.iznajmljivanjeknjiga;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Iznajmljivanje {

	@Id
	private Long id;
	private Long idKorisnika;
	private Long idKopijaKnjige;
	private LocalDateTime datumIznajmljivanja;
	private Long idUposlenika;
	private Double platiti;
	
	public Iznajmljivanje() {
		super();
	}
	public Iznajmljivanje(Long id, Long idKorisnika, Long idKopijaKnjige, LocalDateTime datumIznajmljivanja,
			Long idUposlenika, Double platiti) {
		super();
		this.id = id;
		this.idKorisnika = idKorisnika;
		this.idKopijaKnjige = idKopijaKnjige;
		this.datumIznajmljivanja = datumIznajmljivanja;
		this.idUposlenika = idUposlenika;
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
	public Long getIdKopijaKnjige() {
		return idKopijaKnjige;
	}
	public void setIdKopijaKnjige(Long idKopijaKnjige) {
		this.idKopijaKnjige = idKopijaKnjige;
	}
	public LocalDateTime getDatumIznajmljivanja() {
		return datumIznajmljivanja;
	}
	public void setDatumIznajmljivanja(LocalDateTime datumIznajmljivanja) {
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
	
}
