package com.souha.marque.service;

import com.souha.marque.dto.APIResponseDto;
import com.souha.marque.dto.VoitureDto;
import com.souha.marque.entities.Marque;
import com.souha.marque.dto.MarqueDto;
import com.souha.marque.repos.MarqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class MarqueServiceImpl implements MarqueService {


    private MarqueRepository marqueRepository;

    //private WebClient webClient;

    private APIClient apiClient;

    @Override
    public APIResponseDto getMarqueById(Long id) {
        Marque marque = marqueRepository.findById(id).get();


      /* VoitureDto voitureDto = webClient.get()
                .uri("http://localhost:8080/api/voitures/" + marque.getVoitserie())
                .retrieve()
                .bodyToMono(VoitureDto.class)
                .block();*/
        VoitureDto voitureDto = apiClient.getVoitureBySerie(marque.getVoitserie());

        MarqueDto marqueDto = new MarqueDto(
                marque.getId(),
                marque.getNomMar(),
                marque.getPaysOrigine(),
                marque.getVoitserie(),
                voitureDto.getModele()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setMarqueDto(marqueDto);
        apiResponseDto.setVoitureDto(voitureDto);
        return apiResponseDto;
    }}


