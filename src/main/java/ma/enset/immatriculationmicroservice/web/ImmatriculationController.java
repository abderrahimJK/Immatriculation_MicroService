package ma.enset.immatriculationmicroservice.web;

import ma.enset.immatriculationmicroservice.entities.Proprietaire;
import ma.enset.immatriculationmicroservice.entities.Vehicule;
import ma.enset.immatriculationmicroservice.repository.ProprietaireRepository;
import ma.enset.immatriculationmicroservice.repository.VehiculeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImmatriculationController {

    ProprietaireRepository proprietaireRepository;
    VehiculeRepository vehiculeRepository;

    public ImmatriculationController(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository) {
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
    }

    @GetMapping("/vehicules")
    public List<Vehicule> getAllVehicules(){
        return vehiculeRepository.findAll();
    }

    @GetMapping("/vehicules/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return vehiculeRepository.findById(id).get();
    }

    @GetMapping("/proprietaires")
    public List<Proprietaire> getProprietaires(){
        return proprietaireRepository.findAll();
    }
//  *********
    @GetMapping("/proprietaires/{id}")
    public Proprietaire getProprietaireById(@PathVariable Long id){
        return proprietaireRepository.findById(id).get();
    }

    @GetMapping("/vehicule")
    public Vehicule getVehiculeByMatricule(@RequestParam String mat){
        return vehiculeRepository.findVehiculeByMatricule(mat);
    }
//  ************
    @PostMapping("/proprietaires")
    public Proprietaire addPrp(@RequestBody Proprietaire proprietaire){
        return proprietaireRepository.save(proprietaire);
    }
    @PostMapping("/vehicules")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }

    //  *********
    @DeleteMapping("/proprietaires/{id}")
    public void deleteProp(@PathVariable Long id){
        proprietaireRepository.deleteById(id);
    }

    @DeleteMapping("/vehicules/{id}")
    public void deleteVehicule(@PathVariable Long id){
        vehiculeRepository.deleteById(id);
    }

    //  *********
    @PutMapping("/proprietaires/{id}")
    public Proprietaire updateProp(@PathVariable Long id, @RequestBody Proprietaire proprietaire){
       proprietaire.setId(id);
       return proprietaireRepository.save(proprietaire);
    }

    @PutMapping("/vehicules/{id}")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule, @PathVariable Long id){
        vehicule.setId(id);
        return vehiculeRepository.save(vehicule);
    }
}
