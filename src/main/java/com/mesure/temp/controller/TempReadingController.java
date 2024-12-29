package com.mesure.temp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mesure.temp.model.TemperatureLog;
import com.mesure.temp.service.TemperatureLogService;

@RestController
@RequestMapping("/temperature-logs")
public class TempReadingController {

    @Autowired
    private TemperatureLogService temperatureLogService;

    @GetMapping("/")
    public List<TemperatureLog> getAllTemperatureReadings() {
        return temperatureLogService.getAllReadings();
    }
     @PostMapping("/")
    public TemperatureLog createReading(@RequestBody TemperatureLog reading) {
        return temperatureLogService.saveReading(reading);
    }
}