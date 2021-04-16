package com.etf.editzaposlenika.feign;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.etf.editzaposlenika.dto.Korisnik;

@org.springframework.cloud.openfeign.FeignClient(name = "login-korisnika")
public interface FeignClient {

	@GetMapping("login")
	public List<Korisnik> getAll();

}
