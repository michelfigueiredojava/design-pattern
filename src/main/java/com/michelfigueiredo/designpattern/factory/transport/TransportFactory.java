package com.michelfigueiredo.designpattern.factory.transport;

/**
 * @author mfigueiredo
 */
class TransportFactory {
    Transport createTransport(int passengersNumber) {
        if (passengersNumber <= 5) {
            return new Car();
        } else if (passengersNumber <= 10) {
            return new Van();
        } else {
            throw new RuntimeException("please go by bus :)");
        }
    }
}
