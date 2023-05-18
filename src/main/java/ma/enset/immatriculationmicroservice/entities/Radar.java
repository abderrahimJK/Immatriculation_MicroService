package ma.enset.immatriculationmicroservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Radar {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int vitesse_max;
    private int longitude;
    private int latitude;

}
