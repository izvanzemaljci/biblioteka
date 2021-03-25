package com.etf.editzaposlenika;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="edit-zaposlenika")
public class Zaposlenik {
	@Id
    public String id_worker;
	public String id_user;
    public String name;
    public String dateOfBirth;
    public String dateOfEmployment;

    public Zaposlenik() {}

    public Zaposlenik(String id_worker, String id_user, String name, String dateOfBirth, String dateOfEmployment) {
        super();
        this.id_worker = id_worker;
        this.id_user = id_user;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getId_worker() {
		return id_worker;
	}

	public void setId_worker(String id_worker) {
		this.id_worker = id_worker;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(String dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

    @Override
    public String toString() {
        return "Zaposlenik, id= " + id_worker + ", ime=" + name; 
    }
}
