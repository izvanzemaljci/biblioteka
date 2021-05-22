package com.etf.clanarina.dto;

public class Korisnik {

	public Long _id;
	public String username;
	public String password;
	public Long role;

	public Korisnik() {
		super();
	}

	public Korisnik(Long _id, String username, String password, Long role) {
		super();
		this._id = _id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
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

}
