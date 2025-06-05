package com.devsuperior.bds02.repositories;

import com.devsuperior.bds02.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findAllByOrderByNameAsc();
}
