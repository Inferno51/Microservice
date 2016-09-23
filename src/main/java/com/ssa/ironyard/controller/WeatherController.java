package com.ssa.ironyard.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import com.ssa.ironyard.services.WeatherService;

@RestController
@RequestMapping(value= "/weather")
public class WeatherController {
    
    @Autowired
    WeatherService ws;
    
    @RequestMapping(value = "")
    public View homeView() {
    return new InternalResourceView("weatherFront.html");
    }

    static final Logger LOGGER = LogManager.getLogger(WeatherController.class);
    
    @RequestMapping(value = "local", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> home(HttpServletRequest request) {
        Map<String, Object> easyMap = new HashMap<>();
        easyMap.put("success", ws.getWeather("MD", "Columbia"));
        return ResponseEntity.ok().body(easyMap);
    }
    
    
    @RequestMapping(value = "local/{state}/{city}", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> weather(HttpServletRequest request, @PathVariable String state, @PathVariable String city) {
        Map<String, Object> easyMap = new HashMap<>();
        easyMap.put("success", ws.getWeather(state, city));
        return ResponseEntity.ok().body(easyMap);
    }
}