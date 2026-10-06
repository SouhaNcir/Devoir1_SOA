package com.souha.marque.service;

import com.souha.marque.dto.APIResponseDto;
import com.souha.marque.dto.MarqueDto;

public interface MarqueService {
    APIResponseDto getMarqueById(Long id);
}
