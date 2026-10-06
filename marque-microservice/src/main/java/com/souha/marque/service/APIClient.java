package com.souha.marque.service;

import com.souha.marque.dto.VoitureDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080", value = "VOITURE")
@FeignClient(name = "VOITURE")
public interface APIClient {

    @GetMapping("/api/voitures/{voiture-serie}")
    public VoitureDto getVoitureBySerie(@PathVariable("voiture-serie") String voitureserie);
}
