package com.etf.loginkorisnika.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="login-korisnika")
public class Korisnik {

    @Id
    public ObjectId id;
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id_user;
	public String username;
    public String password;
    public Long role;

    public Korisnik() {}

    public Korisnik(Long id_user, String username, String password, Long role) {
        super();
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Username=" + username; 
    }
    
}
