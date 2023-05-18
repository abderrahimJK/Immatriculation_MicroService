package ma.enset.immatriculationmicroservice.repository;

import ma.enset.immatriculationmicroservice.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {

}
