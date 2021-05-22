package com.etf.iznajmljivanjeknjiga.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.etf.iznajmljivanjeknjiga.dto.Zaposlenik;

@FeignClient(name = "edit-zaposlenika")
public interface ZaposleniciFeignClient {

	@GetMapping("zaposlenici/{id}")
	public Zaposlenik getById(@PathVariable("id") Long id);
}
