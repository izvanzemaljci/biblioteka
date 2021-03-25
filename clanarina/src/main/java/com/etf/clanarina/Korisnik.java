package com.etf.clanarina;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Korisnik {
	
	 	@Id
	    public Long id;
	    public String ime;
	    public String prezime;
	    public LocalDateTime datumRodjenja;
	    public Long idUser;

	    public Korisnik() {
	    	super();
	    }

	    public Korisnik(Long id, String ime, String prezime, LocalDateTime datumRodjenja, Long idUser) {
	        super();
	        this.id = id;
	        this.ime = ime;
	        this.prezime = prezime;
	        this.datumRodjenja = datumRodjenja;
	        this.idUser=idUser;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getIme() {
	        return ime;
	    }

	    public void setIme(String ime) {
	        this.ime = ime;
	    }

	    public String getPrezime() {
	        return prezime;
	    }

	    public void setPassword(String prezime) {
	        this.prezime = prezime;
	    }

	    public LocalDateTime getDatumRodjenja() {
	        return datumRodjenja;
	    }

	    public void setDatumRodjenja(LocalDateTime datumRodjenja) {
	        this.datumRodjenja = datumRodjenja;
	    }
	    public Long getIdUser() {
	    	return idUser;
	    }
	    public void setIdUser(Long idUser) {
	    	this.idUser=idUser;
	    }
	    
	   
}
