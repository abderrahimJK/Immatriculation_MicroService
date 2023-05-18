package ma.enset.immatriculationmicroservice;

import ma.enset.immatriculationmicroservice.entities.Proprietaire;
import ma.enset.immatriculationmicroservice.entities.Vehicule;
import ma.enset.immatriculationmicroservice.repository.ProprietaireRepository;
import ma.enset.immatriculationmicroservice.repository.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ImmatriculationMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository){
        return args -> {

            for (int i = 0; i < 4; i++) {
                proprietaireRepository.save(
                        new Proprietaire().builder()
                                .id(null)
                                .nom("abderrahim"+Math.random()*10)
                                .email("abdo"+Math.random()*100+"@gmail.ma")
                                .DateNaissance("23/03/1999")
                                .build()
                );
            }

            Vehicule vehicule =vehiculeRepository.save(new Vehicule().builder()
                    .matricule("4332A2")
                    .marque("BMW")
                    .model("2020")
                    .puissance_fiscale(140)
                    .proprietaire(proprietaireRepository.findById(1L).get())
                    .build());
        };
    }
}
