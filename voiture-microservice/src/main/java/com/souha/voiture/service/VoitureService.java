package com.souha.voiture.service;

import com.souha.voiture.dto.VoitureDto;

public interface VoitureService {
    VoitureDto getVoitureBySerie(String serie);
}
