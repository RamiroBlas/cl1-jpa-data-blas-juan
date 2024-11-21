package pe.edu.i202331020.cl1.jpa.data.blas.juan.entity;

import jakarta.persistence.*;
import lombok.*;
import pe.edu.i202331020.cl1.jpa.data.blas.juan.enums.IsOfficialEnum;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    @Column(name = "Language")
    private String language;

    @Enumerated(EnumType.STRING)
    @Column(name = "IsOfficial")
    private IsOfficialEnum isOfficial;

    @Column(name = "Percentage")
    private Double percentage;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode")
    @Id
    private Country country;

}
