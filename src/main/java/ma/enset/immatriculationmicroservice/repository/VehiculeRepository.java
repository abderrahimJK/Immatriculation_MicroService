package ma.enset.immatriculationmicroservice.repository;

import ma.enset.immatriculationmicroservice.entities.Proprietaire;
import ma.enset.immatriculationmicroservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

    Vehicule findVehiculeByMatricule(String matricule);
}
