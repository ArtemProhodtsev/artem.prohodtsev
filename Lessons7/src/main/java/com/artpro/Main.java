package com.artpro;


import com.artpro.model.GroundTransport;
import com.artpro.service.PassengerTransportService;

public class Main {
    public static void main(String[] args) {
        //выведем в консоль метод из PassengerTransportService
        // создадим новый объект с именем passengerTransportService из класса PassengerTransportService
        PassengerTransportService passengerTransportService = new PassengerTransportService();
//       теперь объект passengerTransportService обладает всеми методами в классе PassengerTransportService
// простучимся к методу calculationPassengerTransport передав параметры метода и сначала написал вот так:
//        passengerTransportService.calculationPassengerTransport(Opel, 10);
        //но Opel ещё не был создан и по этому воспользовался специальным builder()
        GroundTransport Opel = GroundTransport.builder().brand("Opel").fuelСonsumption(10).maxSpeed(220).build();
        passengerTransportService.calculationPassengerTransport(Opel, 2.5);
    }
}
