package com.souha.voiture.restControllers;

import com.souha.voiture.config.Configuration;
import com.souha.voiture.dto.VoitureDto;
import com.souha.voiture.service.VoitureService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/voitures")
public class VoitureController {
    private VoitureService voitureService;

    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    Configuration configuration;;

    public VoitureController (VoitureService voitureService) {
        this.voitureService = voitureService;
    }


    @GetMapping("{serie}")
    public ResponseEntity<VoitureDto> getVoitBySerie(@PathVariable("serie") String serie){
        return new ResponseEntity<VoitureDto>(
                voitureService.getVoitureBySerie(serie),
                HttpStatus.OK);

    }

    @GetMapping("/version")
    public ResponseEntity<String> version()
    {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }



}
