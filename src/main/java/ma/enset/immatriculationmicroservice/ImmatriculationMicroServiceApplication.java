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
import java.util.Random;

@SpringBootApplication
public class ImmatriculationMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository){
        return args -> {

            String[] p = {"Aabderrahim ait Bouna", "Yassin Karimi", "Khalid Ait Bouna", "Abderrahmane Ali"};
            String[] cars = {"BMW", "Mercedes Benz", "Tesla", "NAMIX"};

            for (int i = 0; i < 4; i++) {
               Proprietaire proprietaire = proprietaireRepository.save(
                        new Proprietaire().builder()
                                .id(null)
                                .nom(p[i])
                                .email(p[i].replaceAll(" ", "")+"@bouna.ma")
                                .DateNaissance("23/03/1999")
                                .build()
                );
              vehiculeRepository.save(new Vehicule().builder()
                        .matricule(generateRegistrationNumber())
                        .marque(cars[i])
                        .model(String.valueOf(generateRandomNumber(1)))
                        .puissance_fiscale(generateRandomNumber(0))
                        .proprietaire(proprietaire)
                        .build());
            }

        };
    }
    private String generateRegistrationNumber() {
        StringBuilder registrationNumber = new StringBuilder();

        // Generate the first two letters (e.g., AB)
        Random random = new Random();
        char letter1 = (char) (random.nextInt(26) + 'A');
        char letter2 = (char) (random.nextInt(26) + 'A');
        registrationNumber.append(letter1).append(letter2);

        // Generate the next two digits (e.g., 12)
        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        registrationNumber.append(digit1).append(digit2);

        // Generate the last two letters (e.g., XY)
        char letter3 = (char) (random.nextInt(26) + 'A');
        char letter4 = (char) (random.nextInt(26) + 'A');
        registrationNumber.append(letter3).append(letter4);

        return registrationNumber.toString();
    }

    private int generateRandomNumber(int x) {
        Random random = new Random();
        int min = 4;
        int max = 120;
        if(x==1){
             min = 10;
             max = 200;
        }

        // Generate a random number between min and max (inclusive)
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }

}
