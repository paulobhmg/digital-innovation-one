package com.dev.paulonogueira.citiesapi.infrastructure.service;

import com.dev.paulonogueira.citiesapi.domain.exception.ResourceNotFoundException;
import com.dev.paulonogueira.citiesapi.domain.model.Country;
import com.dev.paulonogueira.citiesapi.domain.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Page<Country> list(Pageable page){
        return countryRepository.findAll(page);
    }

    public Country findByIdOrThrowsResourceNotFoundException(Long id) {
        Optional<Country> country = countryRepository.findById(id);
        if(!country.isPresent()){
           throw new ResourceNotFoundException("Pais de código " + id + " não existe.");
        }
        return country.get();
    }
}
