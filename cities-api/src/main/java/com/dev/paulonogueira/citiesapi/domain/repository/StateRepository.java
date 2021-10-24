package com.dev.paulonogueira.citiesapi.domain.repository;

import com.dev.paulonogueira.citiesapi.domain.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
