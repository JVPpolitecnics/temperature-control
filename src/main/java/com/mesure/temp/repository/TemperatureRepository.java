package com.mesure.temp.repository;

import org.springframework.stereotype.Repository;

import com.mesure.temp.model.TemperatureLog;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TemperatureRepository extends JpaRepository<TemperatureLog, Long> {

    
}