package com.souha.voiture.service;

import com.souha.voiture.dto.VoitureDto;
import com.souha.voiture.entities.Voiture;
import com.souha.voiture.repos.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VoitureServiceImpl implements VoitureService{
    @Autowired
    VoitureRepository voitureRepository;

    @Override
    public VoitureDto getVoitureBySerie(String serie) {
        Voiture voit = voitureRepository.findByVoitserie(serie);
        VoitureDto voitureDto = new VoitureDto(
                voit.getIdVoiture(),
                voit.getModele(),
                voit.getVoitserie(),
                voit.getBoiteVitesse(),
                voit.getCouleur(),
                voit.getTypeCarburant()
        );
        return voitureDto;
    }
}
