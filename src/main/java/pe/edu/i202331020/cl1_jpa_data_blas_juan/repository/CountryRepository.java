package pe.edu.i202331020.cl1_jpa_data_blas_juan.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202331020.cl1_jpa_data_blas_juan.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
