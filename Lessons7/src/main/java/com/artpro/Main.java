package com.artpro;

import com.artpro.model.GroundTransport;
import com.artpro.service.TransportAction;

public class Main {
    public static void main(String[] args) {
        TransportAction transportAction = new TransportAction();
        GroundTransport audi = GroundTransport.builder().fuelСonsumption(10).brand("Audi").maxSpeed(220).numberOfWheels(4).build();
        transportAction.calculation(audi, 2.5);
    }
}
