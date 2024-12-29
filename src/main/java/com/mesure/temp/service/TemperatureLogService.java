package com.mesure.temp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mesure.temp.model.TemperatureLog;
import com.mesure.temp.repository.TemperatureRepository;

@Service
public class TemperatureLogService {
    
    @Autowired
    private TemperatureRepository repository;


    public List<TemperatureLog> getAllReadings() {
        return repository.findAll();
    }

    public TemperatureLog getReadingById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public TemperatureLog saveReading(TemperatureLog temperatureLog) {
        return repository.save(temperatureLog);
    }

    public void deleteReading(Long id) {
        repository.deleteById(id);
    }


}
