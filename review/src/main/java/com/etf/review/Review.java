package com.etf.review;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="review")
public class Review {
	
	@Id
	private Long id;
	private Long idIznajmljivanja;
	private Double ocjena;
	
	public Review(Long id, Long idIznajmljivanja, Double ocjena) {
		super();
		this.id = id;
		this.idIznajmljivanja = idIznajmljivanja;
		this.ocjena = ocjena;
	}
	
	public Review() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdIznajmljivanja() {
		return idIznajmljivanja;
	}
	public void setIdIznajmljivanja(Long idIznajmljivanja) {
		this.idIznajmljivanja = idIznajmljivanja;
	}
	public Double getOcjena() {
		return ocjena;
	}
	public void setOcjena(Double ocjena) {
		this.ocjena = ocjena;
	}
	
}
