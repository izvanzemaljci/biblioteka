package com.etf.loginkorisnika.dto;

public class LoginRequest {
    public Long id;
	public String username;
    public String password;
    public Long role;

    public LoginRequest() {}

    public LoginRequest(Long id, String username, String password, Long role) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }
}
