package ma.enset.immatriculationmicroservice.SOAP_sevices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.enset.immatriculationmicroservice.entities.Vehicule;
import ma.enset.immatriculationmicroservice.repository.VehiculeRepository;
import org.springframework.stereotype.Component;

@WebService
@Component
public class VehiculeService {

    VehiculeRepository vehiculeRepository;

    public VehiculeService(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @WebMethod
    public Vehicule getVehicule(@WebParam(name = "id") Long id){
        return vehiculeRepository.findById(id).get();
    }
    @WebMethod
    public Vehicule updateVehicule(@WebParam(name = "Vehicule") Vehicule vehicule, @WebParam Long id){
        vehicule.setId(id);
        return vehiculeRepository.save(vehicule);
    }
    @WebMethod
    public void deleteVehicule(@WebParam(name = "id")Long id){
        vehiculeRepository.deleteById(id);
    }
    @WebMethod
    public Vehicule addVehicule(
                               @WebParam(name = "matricule") String matricule,
                               @WebParam(name = "marque") String marque,
                               @WebParam(name = "puissance_fiscale") int puissance_fiscale,
                               @WebParam(name = "model") String model
    ){
        return vehiculeRepository.save(new Vehicule().builder()
                .id(null)
                .marque(marque)
                .matricule(matricule)
                .model(model)
                .puissance_fiscale(puissance_fiscale)
                .build()
        );
    }


}
