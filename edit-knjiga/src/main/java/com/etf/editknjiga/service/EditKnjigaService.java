package com.etf.editknjiga.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etf.editknjiga.model.Autor;
import com.etf.editknjiga.model.Knjiga;
import com.etf.editknjiga.model.KnjigaExtended;
import com.etf.editknjiga.repository.AutorRepository;
import com.etf.editknjiga.repository.KnjigaRepository;

@Service
public class EditKnjigaService {
	@Autowired
	private KnjigaRepository iznajmljivanjeKnjigaRepository;
	@Autowired
	private AutorRepository authorRepository;

	public List<KnjigaExtended> findAll() {
		List<Knjiga> knjige = iznajmljivanjeKnjigaRepository.findAll();
		List<KnjigaExtended> knjigeExtended = new ArrayList<KnjigaExtended>();
		KnjigaExtended k = null;
		for (int i = 0; i < knjige.size(); i++) {
			k = new KnjigaExtended(knjige.get(i).getId(), knjige.get(i).getNaziv(), knjige.get(i).getZanr());
			Autor a = authorRepository.findById(knjige.get(i).getIdAutor()).orElse(null);

			if (a != null)
				k.setAutor(a.getIme() + " " + a.getPrezime());
			k.setStatus("available");
			knjigeExtended.add(k);

		}
		return knjigeExtended;
	}

	public Knjiga findById(Long id) {
		return iznajmljivanjeKnjigaRepository.findById(id).orElse(new Knjiga());
	}

	public void delete(Long id) {
		iznajmljivanjeKnjigaRepository.delete(iznajmljivanjeKnjigaRepository.findById(id).orElse(new Knjiga()));

	}
}
