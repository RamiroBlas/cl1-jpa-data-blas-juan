package pe.edu.i202331020.cl1.jpa.data.blas.juan.entity;

import jakarta.persistence.*;
import lombok.*;
import pe.edu.i202331020.cl1.jpa.data.blas.juan.enums.ContinentEnum;
import pe.edu.i202331020.cl1.jpa.data.blas.juan.utils.ContinentEnumConverter;

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
    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Convert(converter = ContinentEnumConverter.class)
    @Column(name = "Continent")
    private ContinentEnum continent;

    @Column(name = "Region")
    private String region;

    @Column(name = "SurfaceArea")
    private Double surfaceArea;

    @Column(name = "IndepYear")
    private Integer indepYear;

    @Column(name = "Population")
    private Integer population;

    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;

    @Column(name = "GNP")
    private Double gnp;

    @Column(name = "GNPOld")
    private Double gnpOld;

    @Column(name = "LocalName")
    private String localName;

    @Column(name = "GovernmentForm")
    private String governmentForm;

    @Column(name = "HeadOfState")
    private String headOfState;

    @Column(name = "Capital")
    private Integer capital;

    @Column(name = "Code2")
    private String code2;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CountryLanguage> languages;

}
