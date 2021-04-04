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
    public Long _id;
	public String username;
    public String password;
    public Long role;

    public Korisnik() {}

    public Korisnik(Long id, String username, String password, Long role) {
        super();
        this._id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
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
