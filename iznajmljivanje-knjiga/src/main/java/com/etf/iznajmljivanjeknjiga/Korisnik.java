package com.etf.iznajmljivanjeknjiga;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="login-korisnika")
public class Korisnik {

    @Id
    public String id;
    public String username;
    public String password;
    public String role;

    public Korisnik() {}

    public Korisnik(String id, String username, String password, String role) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Korisnik, id= " + id + ", username=" + username+", password=" + password; 
    }
    
}
