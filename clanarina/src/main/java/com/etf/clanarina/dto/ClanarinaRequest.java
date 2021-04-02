package com.etf.clanarina.dto;


public class ClanarinaRequest {	
	private Long id;
	
	
	private Long idKorisnika;
	
	
	private String datumUpisa;
	private Double platiti;
	
	
	public void Clanarina(Long id, Long idKorisnika,  String datumUpisa, Double platiti) {
		
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

