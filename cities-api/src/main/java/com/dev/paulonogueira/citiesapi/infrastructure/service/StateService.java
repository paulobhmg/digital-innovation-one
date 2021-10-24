package com.dev.paulonogueira.citiesapi.infrastructure.service;

import com.dev.paulonogueira.citiesapi.domain.exception.ResourceNotFoundException;
import com.dev.paulonogueira.citiesapi.domain.model.State;
import com.dev.paulonogueira.citiesapi.domain.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public Page<State> list(Pageable page){
        return stateRepository.findAll(page);
    }

    public State findByIdOrThrowsResourceNotFoundException(Long id){
        Optional<State> state = stateRepository.findById(id);
        if(!state.isPresent()){
            throw new ResourceNotFoundException("Estade codigo " + id + " nao existe.");
        }
        return state.get();
    }
}
