package com.souha.voiture.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoitureDto {
    private Long idVoiture;
    private String modele;
    private String Voitserie;
    private String couleur;
    private String typeCarburant;
    private String boiteVitesse;
}
