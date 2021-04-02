package com.etf.editknjiga.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.etf.editknjiga.repository.EditKnjigaRepository;
import com.etf.editknjiga.model.Knjiga;
import com.etf.editknjiga.model.Knjiga;

@Service
public class EditKnjigaService {
	@Autowired
	private EditKnjigaRepository iznajmljivanjeKnjigaRepository;

	public List<Knjiga> findAll() {
		return iznajmljivanjeKnjigaRepository.findAll();
	}
	public Knjiga findById(Long id) {
		return iznajmljivanjeKnjigaRepository.findById(id).orElse(new Knjiga());
	}
	
	public void delete(Long id) {
		iznajmljivanjeKnjigaRepository
				.delete(iznajmljivanjeKnjigaRepository.findById(id).orElse(new Knjiga()));

	}
}



