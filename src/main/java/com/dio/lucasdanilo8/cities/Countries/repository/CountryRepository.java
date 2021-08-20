package com.dio.lucasdanilo8.cities.Countries.repository;

import com.dio.lucasdanilo8.cities.Countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>{
}
