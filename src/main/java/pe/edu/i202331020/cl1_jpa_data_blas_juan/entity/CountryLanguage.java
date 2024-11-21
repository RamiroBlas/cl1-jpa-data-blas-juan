package pe.edu.i202331020.cl1_jpa_data_blas_juan.entity;

import jakarta.persistence.*;
import lombok.*;
import pe.edu.i202331020.cl1_jpa_data_blas_juan.enums.IsOfficialEnum;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    private String language;
    @Enumerated(EnumType.STRING)
    private IsOfficialEnum isOfficial;
    private Double percentage;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode")
    @Id
    private Country country;

}
