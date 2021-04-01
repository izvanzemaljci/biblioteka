package com.etf.clanarina.model;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "korisnik")

public class Korisnik {
	
	 	@Id
	 	private ObjectId objectId;
	 	
	 	@GeneratedValue(strategy = GenerationType.AUTO)
	    public Long id;
	 	
		@NotNull(message = "Ime can't be null")
	    public String ime;
		
		@NotNull(message = "Prezime can't be null")
	    public String prezime;
		
		@NotNull(message = "DatumRodjenja can't be null")
	    public LocalDateTime datumRodjenja;
		
		@NotNull(message = "IdUser can't be null")
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
	    public void setPrezime(String prezime) {
	        this.prezime = prezime;
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
