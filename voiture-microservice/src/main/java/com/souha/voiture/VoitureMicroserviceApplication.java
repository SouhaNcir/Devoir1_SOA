package com.souha.voiture;

import com.souha.voiture.entities.Voiture;
import com.souha.voiture.repos.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VoitureMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoitureMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(VoitureRepository voitureRepository) {

        return args -> {

            voitureRepository.save(
                    Voiture.builder()
                            .modele("Clio")
                            .voitserie("V001")
                            .couleur("Rouge")
                            .typeCarburant("Essence")
                            .boiteVitesse("Manuelle")
                            .build()
            );

            voitureRepository.save(
                    Voiture.builder()
                            .modele("Golf")
                            .voitserie("V002")
                            .couleur("Noire")
                            .typeCarburant("Diesel")
                            .boiteVitesse("Automatique")
                            .build()
            );
        };
    }
}