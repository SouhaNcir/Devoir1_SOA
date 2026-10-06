package com.souha.marque;

import com.souha.marque.entities.Marque;
import com.souha.marque.repos.MarqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MarqueMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarqueMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MarqueRepository marqueRepository) {
        return args -> {

            marqueRepository.save(
                    Marque.builder()
                            .nomMar("Toyota")
                            .paysOrigine("Japon")
                            .voitserie("V001")
                            .build()
            );

            marqueRepository.save(
                    Marque.builder()
                            .nomMar("BMW")
                            .paysOrigine("Allemagne")
                            .build()
            );

            marqueRepository.save(
                    Marque.builder()
                            .nomMar("Peugeot")
                            .paysOrigine("France")
                            .build()
            );
        };
    }
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
