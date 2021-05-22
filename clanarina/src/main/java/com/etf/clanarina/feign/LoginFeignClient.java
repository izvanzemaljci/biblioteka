package com.etf.clanarina.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.etf.clanarina.dto.Korisnik;

@org.springframework.cloud.openfeign.FeignClient(name = "login-korisnika")
public interface LoginFeignClient {

	@GetMapping("login/{id}")
	public Korisnik getById(@PathVariable("id") Long _id);

}
