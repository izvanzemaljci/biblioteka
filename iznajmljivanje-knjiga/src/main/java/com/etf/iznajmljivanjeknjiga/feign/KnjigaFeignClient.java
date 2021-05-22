package com.etf.iznajmljivanjeknjiga.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "edit-knjiga")
public interface KnjigaFeignClient {

}
