package com.ssa.ironyard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherStarter {

    static final Logger LOGGER = LogManager.getLogger(WeatherStarter.class);

    public static void main(String[] args) {
	LOGGER.info("Starting microservice");
	SpringApplication.run(WeatherStarter.class, args);
    }

}
