package com.dev.paulonogueira.citiesapi.domain.repository;

import com.dev.paulonogueira.citiesapi.domain.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT((SELECT lat_lon FROM cities WHERE id = ?1) " +
                    "<@> (SELECT lat_lon FROM cities WHERE id = ?2)) as distance", nativeQuery = true)
    Double calculeDistanceByPointInMiles(long fromCity, long toCity);

    @Query(value = "SELECT earth_distance(ll_to_earth(?1, ?2), ll_to_earth(?3, ?4)) as distance", nativeQuery = true)
    Double calculeByCubeInMeters(double lat1, double lon1, double lat2, double lon2);
}
