package com.etf.iznajmljivanjeknjiga.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.etf.iznajmljivanjeknjiga.dto.Korisnik;

@FeignClient(name = "login-korisnika")
public interface LoginFeignClient {

	@GetMapping("login/{id}")
	public Korisnik getById(@PathVariable("id") Long _id);

}
