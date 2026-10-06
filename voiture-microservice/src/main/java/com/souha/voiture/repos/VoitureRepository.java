package com.souha.voiture.repos;

import com.souha.voiture.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

    Voiture findByVoitserie(String serie);
}