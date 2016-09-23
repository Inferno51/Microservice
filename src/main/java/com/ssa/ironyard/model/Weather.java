package com.ssa.ironyard.model;

public class Weather {
   
    CurrentObservation current_observation;
    
    public Weather() {
    }

    public CurrentObservation getCurrent_observation() {
        return current_observation;
    }

    public void setCurrent_observation(CurrentObservation current_observation) {
        this.current_observation = current_observation;
    }

    @Override
    public String toString() {
        return "Weather [current_observation=" + current_observation + "]";
    }
    
    
}
