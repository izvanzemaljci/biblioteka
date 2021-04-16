package com.etf.editzaposlenika.feign;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.etf.editzaposlenika.dto.Korisnik;

@org.springframework.cloud.openfeign.FeignClient(url = "https://localhost:8686/", name = "login-korisnika")
public interface FeignClient {

	@GetMapping()
	public List<Korisnik> getAll();

}
