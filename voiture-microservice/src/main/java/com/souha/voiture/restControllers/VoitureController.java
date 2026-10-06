package com.souha.voiture.restControllers;

import com.souha.voiture.dto.VoitureDto;
import com.souha.voiture.service.VoitureService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/voitures")
@AllArgsConstructor
public class VoitureController {
    private VoitureService voitureService;

    @GetMapping("{serie}")
    public ResponseEntity<VoitureDto> getVoitBySerie(@PathVariable("serie") String serie){
        return new ResponseEntity<VoitureDto>(
                voitureService.getVoitureBySerie(serie),
                HttpStatus.OK);

    }
}
