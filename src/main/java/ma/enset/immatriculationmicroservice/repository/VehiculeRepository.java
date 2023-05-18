package ma.enset.immatriculationmicroservice.repository;

import ma.enset.immatriculationmicroservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
