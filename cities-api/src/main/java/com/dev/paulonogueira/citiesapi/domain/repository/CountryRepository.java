package com.dev.paulonogueira.citiesapi.domain.repository;

import com.dev.paulonogueira.citiesapi.domain.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
