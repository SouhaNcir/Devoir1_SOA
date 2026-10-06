package com.souha.marque.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarqueDto {
    private Long id;
    private String nomMar;
    private String paysOrigine;
    private String voitserie;
    private String modele;
}
