package ma.enset.immatriculationmicroservice.SOAP_sevices;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfig {

    private Bus bus;
    private VehiculeService vehiculeService;

    public SoapConfig(Bus bus, VehiculeService vehiculeService) {
        this.bus = bus;
        this.vehiculeService = vehiculeService;
    }

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, vehiculeService);
        endpoint.publish("vehiculeServices");
        return endpoint;
    }
}
