package com.ssa.ironyard.services;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ssa.ironyard.model.Weather;

@Component
public class WeatherService {
   
    public Weather getWeather(String state, String city) {
        final String uri = "http://api.wunderground.com/api/5dcb2a5567c89129/conditions/q/"+state+"/"+city +".json";
        RestTemplate restTemplate = new RestTemplate();
        Weather w = restTemplate.getForObject(uri, Weather.class);
          
        return w;
    }
}

