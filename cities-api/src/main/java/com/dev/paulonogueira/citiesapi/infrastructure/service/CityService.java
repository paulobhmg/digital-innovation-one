package com.dev.paulonogueira.citiesapi.infrastructure.service;

import com.dev.paulonogueira.citiesapi.domain.exception.ResourceNotFoundException;
import com.dev.paulonogueira.citiesapi.domain.model.City;
import com.dev.paulonogueira.citiesapi.domain.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public Page<City> list(Pageable page){
        return cityRepository.findAll(page);
    }

    public City findByIdOrThrowsResourceNotFoundException(Long id){
        Optional<City> city = cityRepository.findById(id);
        if(!city.isPresent()){
            throw new ResourceNotFoundException("Cidade de codigo " + id + " nao existe.");
        }
        return city.get();
    }
}
