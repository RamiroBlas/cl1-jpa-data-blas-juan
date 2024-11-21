package pe.edu.i202331020.cl1_jpa_data_blas_juan.entity;

import jakarta.persistence.*;
import lombok.*;
import pe.edu.i202331020.cl1_jpa_data_blas_juan.enums.ContinentEnum;
import pe.edu.i202331020.cl1_jpa_data_blas_juan.utils.ContinentEnumConverter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "country")
public class Country {

    @Id
    private String code;
    private String name;
    @Convert(converter = ContinentEnumConverter.class)
    private ContinentEnum continent;
    private String region;
    private Double surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Double lifeExpectancy;
    private Double gnp;
    private Double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;
    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<City> cities;
    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CountryLanguage> languages;

}
