package com.dev.paulonogueira.citiesapi.infrastructure.service;

import com.dev.paulonogueira.citiesapi.domain.model.City;
import com.dev.paulonogueira.citiesapi.domain.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CalculatorService {

    @Autowired
    private CityRepository cityRepository;

    public Double calculeByPointInMiles(long fromCity, long toCity) {
        return cityRepository.calculeDistanceByPointInMiles(fromCity, toCity);
    }

    public Double calculeByCubeInMeters(long fromCity, long toCity) {
        final List<City> cities = cityRepository.findAllById(Arrays.asList(fromCity, toCity));
        Point pointFrom = cities.get(0).getLocation();
        Point pointGo = cities.get(1).getLocation();
        return cityRepository.calculeByCubeInMeters(pointFrom.getX(), pointFrom.getY(), pointGo.getX(), pointGo.getY());
    }
}
