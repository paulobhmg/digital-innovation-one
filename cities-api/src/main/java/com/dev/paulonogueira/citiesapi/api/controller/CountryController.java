package com.dev.paulonogueira.citiesapi.api.controller;

import com.dev.paulonogueira.citiesapi.domain.exception.ResourceNotFoundException;
import com.dev.paulonogueira.citiesapi.domain.model.Country;
import com.dev.paulonogueira.citiesapi.infrastructure.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping
    public ResponseEntity<Page<Country>> list(Pageable page){
        return ResponseEntity.ok(countryService.list(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(countryService.findByIdOrThrowsResourceNotFoundException(id));
        }catch(ResourceNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
