package pe.edu.i202331020.cl1_jpa_data_blas_juan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202331020.cl1_jpa_data_blas_juan.repository.CountryRepository;

@SpringBootApplication
public class Cl1JpaDataBlasJuanApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataBlasJuanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
