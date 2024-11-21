package pe.edu.i202331020.cl1.jpa.data.blas.juan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202331020.cl1.jpa.data.blas.juan.entity.Country;
import pe.edu.i202331020.cl1.jpa.data.blas.juan.repository.CountryRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
public class Cl1JpaDataBlasJuanApplication implements CommandLineRunner {

    @Autowired
    CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Cl1JpaDataBlasJuanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //CONSULTA 1:
        /*Optional<Country> optionalCountry = countryRepository.findById("ARG");
        optionalCountry.ifPresentOrElse(
				country -> {
					System.out.println("Idiomas hablados en ARG:");
					country.getLanguages().forEach(lang -> System.out.println(lang.getLanguage()));
				},
				() -> {
					countryRepository.findById("PER")
							.ifPresent(per -> {
								System.out.println("Idiomas hablados en PER:");
								per.getLanguages().forEach(lang -> System.out.println(lang.getLanguage()));
							});
                }
        );*/


        //CONSULTA 2:
        /*List<String> lista = List.of("COL", "ARG");
        lista.stream().filter((item) -> {
            return countryRepository.existsById(item);
        }).collect(Collectors.toList());
        lista.stream().filter(countryRepository::existsById).collect(Collectors.toList());
        countryRepository.deleteAllById(lista);*/


        //CONSULTA 3:
        Optional<Country> optionalCountry = countryRepository.findById("ARG");
        optionalCountry.ifPresentOrElse(
				country -> {
					System.out.println("Idiomas hablados en ARG:");
					country.getLanguages().forEach(lang -> System.out.println(lang.getLanguage()));
				},
				() -> {
					countryRepository.findById("PER")
							.ifPresent(per -> {
								System.out.println("Idiomas hablados en PER:");
								per.getLanguages().forEach(lang -> System.out.println(lang.getLanguage()));
							});
                }
        );
    }
}
